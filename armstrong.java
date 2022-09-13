import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        int number,copy_number, arm_strong_number = 0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        try{
            number = sc.nextInt();
            copy_number = number;

            while(number>0){
                int reminder = number%10;
                arm_strong_number = (reminder*reminder*reminder) + arm_strong_number;
                number = number/10;
            }
            if(arm_strong_number == copy_number){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }finally{
            sc.close();
        }
    }
}
