package Question3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args){
        String s = "walabcwalexywalxzsfwalmx";
        String res= Arrays.asList(s.split("(?i)wal")).stream().collect(Collectors.joining("sams"));
        System.out.println(res);
    }
}
