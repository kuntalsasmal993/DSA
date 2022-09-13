public class swaping {
     public static void byThirdVariable(int m, int n){
            int temp;
            temp = m;
            m = n;
             n = temp;

             System.out.println("after m = "+m+" and n = "+n);


        }





        public static void byAddition(int m , int n){
            m = m+n;
            n = m-n;
            m = m-n;
            System.out.println("after m = "+m+" and n = "+n);

        }






        public static void byXor(int m, int n){

            m = m^n;
            n = m^n;
            m = m^n;

            System.out.println("after m = "+m+" and n = "+n);

        }
    
    public static void main(String[] args) {
  int m = 9, n = 5 ;

  System.out.println("before m = 9 and n = 5");
  //byThirdVariable(m,n);
  //byAddition(m,n);
  byXor(m, n);
        
    }
}
