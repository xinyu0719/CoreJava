package Question1;

public interface CreditCard {
    public void isCardAcceptable(String cardType);

    default void payBill(double bill){
         System.out.println("Your bill is " + bill);
    }

    static void refund(double amount){
        System.out.println("Your refund amount is " + amount);
    }

}
