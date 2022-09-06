package DP3;

public class Main {
    public static void main(String[] args){
        Park park = new Park();
        Automobile automobile1 = new Car("NY1234");
        Automobile automobile2 = new Carriage("NJ998877");
        Automobile automobile3 = new Truck("TX776655");
        park.park(automobile1);
        park.park(automobile2);
        park.park(automobile3);

        try{
            Thread.sleep(10);
            park.out(automobile2);
            park.out(automobile1);
            park.out(automobile3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }
}
