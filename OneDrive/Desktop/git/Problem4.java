import java.util.ArrayList;
import java.util.List;

//Given a list of string array, combine them into one string sentence, return the string sentence
public class Problem4 {
    public static void main(String[] args){
        String[] array ={"my", "name", "is", "xinyu", "wang"};

        String result = String.join(" ", array);

        System.out.println(result);
    }
}
