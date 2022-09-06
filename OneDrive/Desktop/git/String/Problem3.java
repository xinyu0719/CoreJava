import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

//Given string “https://www.amazon.com/demo?test=abc”,
// return [“https”,”www”,”amazon”,”com”,”demo”,”test”,”abc”]

public class Problem3 {
    public static void main(String[] args){
        String str = "https://www.amazon.com/demo?test=abc";
        List<String> tokens = new ArrayList<String>();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ": / . ? = ");
        while(stringTokenizer.hasMoreTokens()){
            tokens.add(stringTokenizer.nextToken());
        }

        for(String a : tokens){
            System.out.println(a);
        }
    }
}
