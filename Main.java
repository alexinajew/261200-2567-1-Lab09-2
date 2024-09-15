package th.ac.cmu.cpe.oop.patterns.adapter.site;

import th.ac.cmu.cpe.oop.patterns.adapter.site.payd.PayD;

public class Main {
    public static void main(String[] args) {
        // Create XpayImpl object
        XpayImpl xpay = new XpayImpl();
        xpay.setCreditCardNo("1234567890123456");
        xpay.setCustomerName("John Doe");
        xpay.setCardExpMonth("12");
        xpay.setCardExpYear("2035");
        xpay.setCardCVVNo((short) 123);
        xpay.setAmount(2560.0);

        // Use adapter to convert Xpay to PayD
        PayD payD = new XpaytoPayDAdapter(xpay);
        
        // Print PayD details
        System.out.println("Credit Card No: " + payD.getCreditCardNo());
        System.out.println("Card Owner Name: " + payD.getCardOwnerName());
        System.out.println("Card Expiry (MM/YY): " + payD.getCardExpMonthYear());
        System.out.println("CVV No: " + payD.getCVVNo());
        System.out.println("Total Amount: $" + payD.getTotalAmount());
    }
}
