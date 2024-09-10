
public class Main {
    public static void main(String[] args) {
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Somchai Jaidee");
        xpay.setCardExpMonth("0 9");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);

        PayD payD = new XpayToPayDAdapter(xpay);

        System.out.println("Card Number: " + payD.getCreditCardNo());
        System.out.println("Card Owner: " + payD.getCardOwnerName());
        System.out.println("Card Expiry: " + payD.getCardExpMonthDate());
        System.out.println("CVV: " + payD.getCVVNo());
        System.out.println("Total Amount: " + payD.getTotalAmount());
    }
}
