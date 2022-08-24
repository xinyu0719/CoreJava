public final class ChangeFinal {
    public static final int money = 1000;
    public final int change(int a){
            money = a;
            return money;
    }
    public static void main(String[] args){
        ChangeFinal test = new ChangeFinal();
        test.change(1500);

        System.out.println(money);
    }
}
