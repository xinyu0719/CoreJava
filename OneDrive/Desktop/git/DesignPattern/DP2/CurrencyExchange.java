package DP2;

public class CurrencyExchange {
    public static Country currencyObject(String country){
        if("China".equals(country)){
            return new China();
        }
        if("America".equals(country)){
            return new America();
        }
        return null;
    }
}
