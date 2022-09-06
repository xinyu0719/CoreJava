package DP2;

public class main {
    public static void main(String[] args){
        CurrencyExchange currencyExchange = new CurrencyExchange();
        Country country1 = currencyExchange.currencyObject("China");
        country1.currencyObject();
        Country country2 = currencyExchange.currencyObject("America");
        country2.currencyObject();
    }
}
