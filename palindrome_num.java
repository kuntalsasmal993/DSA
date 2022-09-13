import java.util.Scanner;
class palindrome_num{
    public static void main(String[] args) {
        int num; int revnum = 0; int copynum;

        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        
        try{
            num = s.nextInt();

        copynum = num;
        while(num>0){
            int reminder = num%10;
            revnum = (revnum*10)+reminder;
            num = num/10;
        }
        if(revnum == copynum){
            System.out.println("True");
        }else{
            System.out.println("false");
        }}finally{
            s.close();
        }

    }
}