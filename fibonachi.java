public class fibonachi {

    static int a = 0, b = 1,c = 2, d, sumOfOdd = 1;

    static void l(int n){
        
        if(n>0){
    int d =a+b+c;
    if(d%2!=0){
        sumOfOdd = sumOfOdd+d;
    }
    a=b; b=c; c=d;
    System.out.print(" "+d);
    
    l(n-1);
    }}

    public static void main(String[] args) {
    
        int n=8;
    System.out.print(a+" "+b+" "+c);
    l(n-3);
    System.out.println("\nSum of odd numbers are: "+sumOfOdd);
    }

}
