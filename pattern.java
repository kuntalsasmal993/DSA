public class pattern {

    public static void main(String[] args) {
        class logic{
            void fp(){
                for(int i =1; i <= 5 ; i++){
                    for(int j = 1 ; j <= i; j++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
        
            }
            void rp(){
                for(int i = 5; i>=1; i--){
                for(int j = 1; j<=i; j++){
                    System.out.print(" + ");
                    
                }
                System.out.println();
            }
        }
    }
    logic lg = new logic();
        lg.fp();
        lg.rp();
   }
}