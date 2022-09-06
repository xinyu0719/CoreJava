package Question1;

public class VisaCard implements CreditCard{
    public String holderName;
    public long cardNumber;
    public double accountBalance;
    public String cardType;

    public VisaCard(String holderName, long cardNumber, double accountBalance, String cardType){
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = cardType;
    }

    @Override
    public void isCardAcceptable(String cardType) {
        if(cardType.equals("VISA")){
            System.out.println("Visa card is available");
        }else{
            System.out.println("This is not visa card");
        }
    }
}
