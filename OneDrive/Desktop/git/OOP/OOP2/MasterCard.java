package OOP2;

public class MasterCard extends CreditCard{
    public MasterCard(String holderName, long cardNumber, double accountBalance, String cardType){
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = cardType;
    }
    public boolean isCardAcceptable(String cardType){
        if(cardType.equals(this.cardType)){
            return true;
        }
        return false;
    };
}
