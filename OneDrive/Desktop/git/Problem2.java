//Given two strings, compare if these two two string are equal by comparing each character.
public class Problem2 {
    public static void main(String[] args){

        System.out.println(compare("xinyu", "xinyu"));

        System.out.println(compare("xinyu", "wang"));

    }
    public static boolean compare(String a, String b){
        int length = 0;
        if(a.length() > b.length()){
            length = a.length();
        }else{
            length = b.length();
        }

        for(int i = 0; i < length; i++){
            if(a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
