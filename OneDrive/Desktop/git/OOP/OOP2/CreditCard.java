package OOP2;

public abstract class CreditCard {
    public String holderName;
    public long cardNumber;
    public double accountBalance;
    public String cardType;

    public abstract boolean isCardAcceptable(String cardType);

    public double payBill(double bill){
        accountBalance = accountBalance - bill;
        return accountBalance;
    }
}
