package Collection;

import java.util.HashMap;

public class MapSimulate {
    HashMap<String, String> record = new HashMap<String, String>();

    public void create(String a, String b){
        record.put(a,b);
    }
    public void readAll(){
        System.out.println(record);
    }
    public void read(String a){
       System.out.println(record.get(a));
    }
    public void update(String a, String b){
        record.replace(a,b);
    }
    public void delete(String a){
        record.remove(a);
    }

}
