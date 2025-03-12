package chap08.basic;

public class Order {
    public static void main(String[] args) {
        double amount = 100.34;

//        CreditCard creditCard = new CreditCard("123456-7891011");
//        creditCard.processPayment(amount);
//
//        Paypal paypal = new Paypal("sample@test.com");
//        paypal.processPayment(amount);

        pay("creditCard",amount);
    }

    static void pay(String paymentMethod , double amount){
        Payment payment;
        if(paymentMethod.equals("creditCard")){
            payment = new CreditCard("12345-67890");
        }else{
            payment = new Paypal("sample@test.com");
        }
        payment.processPayment(amount);
    }
}
