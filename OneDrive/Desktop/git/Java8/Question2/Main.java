package Question2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        MyStream.MyMap(list);

    }
    interface MyStream{
        public static void MyMap(List<Integer> list){
            System.out.println(list.stream()
                                    .map(o -> o *3)
                                    .collect(Collectors.toList()));
        }
    }

    }

