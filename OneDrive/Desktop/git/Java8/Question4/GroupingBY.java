package Question4;

import java.util.*;
import java.util.stream.Collectors;




public class GroupingBY {
    public static void main(String[] args){
        List<String> strList = Arrays.asList("Eclipse", "eclipse", "Eclipse", "eclipse", "amc", "clip", "ECLIPSE");
        Map<String, Integer> res = strList.stream()
                .collect(Collectors.groupingBy(o -> o, () -> new TreeMap<>(String.CASE_INSENSITIVE_ORDER),Collectors.summingInt(o -> 1)));
        System.out.println(res);
    }
}
