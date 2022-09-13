import java.util.Arrays;
public class anagram{
    public static void main(String[] args) {

        String a = "binary";
        String b = "brainy";

        //converting them into arrays

        char x[] = a.toCharArray();
        char y[] = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        // System.out.println(a);
        // System.out.println(x);
        // System.out.println(b);
        // System.out.println(y);

        boolean result = Arrays.equals(x, y);

        if(result == true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
    }
}