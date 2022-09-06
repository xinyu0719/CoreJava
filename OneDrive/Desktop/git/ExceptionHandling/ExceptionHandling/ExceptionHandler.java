package ExceptionHandling;

public class ExceptionHandler {
    public void handleException(String a, String b) throws CardTypeException, AddressException{
        if(a.equals("AMEX")){
            throw new CardTypeException("AMEX card is unavailable");
        }else if(b.equals("outside US")){
            throw new AddressException("Your address is outside US");
        }
    }

    public static void main(String[] args) {
        ExceptionHandler test = new ExceptionHandler();
       try{
           test.handleException("AMEX", "inside US");
       }catch(CardTypeException e){
           System.out.println(e.getMessage());
           e.printStackTrace();
       }catch(AddressException e){
           System.out.println(e.getMessage());
           e.printStackTrace();
       }catch(Exception e){
           System.out.println(e.getMessage());
           e.printStackTrace();
       }
    }
}
