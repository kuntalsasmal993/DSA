import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            try{System.out.println("enter a number: ");
                int num = sc.nextInt();

            int c = 0;
            for(int i = 2; i <= num/2; i++){
                if(num%i==0){
                    c = c+1;
                    break;
                }
            }
            if(c==1){
                System.out.println("not a prime");
            }else{
                System.out.println("prime");
            }}finally{
                sc.close();
            }
    }
}
