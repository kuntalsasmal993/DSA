import java.util.Scanner;

class studentDetails{
    String name;
    String rollNo;
    int result = 0;
    
}
public class examTaker{
    public static void main(String[] args) {

        String ans = "aaaaa";
        char x[] = ans.toCharArray();

        Scanner sc = new Scanner(System.in);
  
        studentDetails a = new studentDetails();
        System.out.println("enter your name: ");
        a.name = sc.nextLine();

        System.out.println("enter your roll number: ");
        a.rollNo = sc.nextLine();

        System.out.println("student answers are: ");
        String s_ans = sc.nextLine();

        char s[] = s_ans.toCharArray();

        System.out.println(s);
        
        for(int i = 0; i<x.length;i++){
        
        if(s[i] == 'a'|| s[i] == 'b' ||  s[i] == 'c' || s[i] == 'd' || s[i] == 'e'){
            if(x[i]==s[i]){
            a.result = a.result+5;
        }else{
            a.result = a.result-3;
        }}if(s[i] != 'a'|| s[i] != 'b' ||  s[i] != 'c' || s[i] != 'd' || s[i] != 'e' || s[i] ==' '){
            a.result = a.result;
        }
    }

    System.out.println(a.result);
    }
    }