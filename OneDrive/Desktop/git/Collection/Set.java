package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Set {
    public void trueFriend(ArrayList<String> l1, ArrayList<String> l2){
        HashSet<String> save = new HashSet<String>();
        ArrayList<String> result = new ArrayList<String>();
        for(String i : l1){
            save.add(i);
        }
        for(String j : l2){
            if(save.contains(j)){
                result.add(j);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args){
        ArrayList<String> l1 = new ArrayList<String>();
        ArrayList<String> l2 = new ArrayList<String>();
        l1.add("wang");
        l1.add("lin");
        l2.add("wang");
        l2.add("zou");
        Set set = new Set();
        set.trueFriend(l1,l2);

    }

}
