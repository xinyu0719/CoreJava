package Question1;

public class Main {
    public static void main(String[] args){
        VisaCard card1 = new VisaCard("wang", 9988776655L, 5000, "ViSA");
        card1.payBill(2500);
        CreditCard.refund(1000);

        MasterCard card2 = new MasterCard("lin", 9988776644L, 7000, "MASTER");
        card2.payBill(2000);
        CreditCard.refund(500);
    }
}
