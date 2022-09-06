package Collection;

import java.util.HashMap;

public class Map {
    public void duplicate(String a){
        HashMap<Character, Integer> result = new HashMap<Character, Integer>();
        HashMap<Character, Integer> res = new HashMap<Character, Integer>();

        for(int i = 0; i <a.length(); i++){
            char c = a.charAt(i);
            if(result.containsKey(c)){
                int count = result.get(c);
                result.put(c, ++count);
                res.put(c, count);

            }
            else{
                result.put(c,1);
            }
        }
        System.out.println(res);
        }

    public static void main(String[] args){
        Map map = new Map();
        map.duplicate("helloworld");
    }
}
