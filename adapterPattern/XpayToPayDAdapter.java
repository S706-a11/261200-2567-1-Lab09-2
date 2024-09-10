
public class XpayToPayDAdapter implements PayD {
    private final Xpay xpay;

    public XpayToPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
    }

    @Override
    public Long getCreditCardNo() {
        return Long.parseLong(xpay.getCreditCardNo());
    }

    @Override
    public void setCreditCardNo(Long creditCardNo) {
        xpay.setCreditCardNo(String.valueOf(creditCardNo));
    }

    @Override
    public String getCardOwnerName() {
        return xpay.getCustomerName();
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        xpay.setCustomerName(cardOwnerName);
    }

    @Override
    public String getCardExpMonthDate() {
        return xpay.getCardExpMonth() + "/" + xpay.getCardExpYear();
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        String[] parts = cardExpMonthDate.split("/");
        xpay.setCardExpMonth(parts[0]);
        xpay.setCardExpYear(parts[1]);
    }

    @Override
    public Integer getCVVNo() {
        return Integer.valueOf(xpay.getCardCVVNo());
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        xpay.setCardCVVNo(cVVNo.shortValue());
    }

    @Override
    public Double getTotalAmount() {
        return xpay.getAmount();
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        xpay.setAmount(totalAmount);
    }
}
