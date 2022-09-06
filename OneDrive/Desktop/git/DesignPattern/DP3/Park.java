package DP3;

import java.util.Date;

public class Park {
    private Automobile[] automobiles = new Automobile[30];
    private long[] times = new long[30];

    public int park(Automobile automobile){
        Date date = new Date();
        for(int i = 0; i < 30; i++){
            if(automobiles[i] == null){
                automobiles[i] = automobile;
                times[i] = date.getTime();
                System.out.println("Parking No. " + i + " is used");
                return i;
            }
        }
        return -1;
    }
    public void out(Automobile automobile){
        Date date = new Date();
        long t = 0;
        for(int i = 0; i < 30; i++){
            if(automobiles[i] == automobile){
                automobiles[i] = null;
                t = date.getTime() - times[i];
                times[i] = 0;
                System.out.println("No. " + i +" is empty now");
                break;
            }
        }
        if(automobile.getType() == Type.CAR){
            System.out.println("you need to pay $ " + (t * 1));
        }else if(automobile.getType() == Type.CARRIAGE){
            System.out.println("you need to pay $ " + (t * 1.5));
        }else{
            System.out.println("you need to pay $ " + (t * 2));
        }
    }
}
