import java.util.Scanner;
public class fibonachiNthElement {

    public static void fab(int N){
        int a = 0;
        int b = 1;
        for(int i = 3 ; i<= N; i++){
            int c = a+b;
            a = b;
            b = c;

            if(i == N){
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        fab(N);
        
    }
}
