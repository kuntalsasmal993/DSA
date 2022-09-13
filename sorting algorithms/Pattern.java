public class Pattern {

    public static void solidRectangle(int n, int m){
        // *  *  *  *  *  * 
        // *  *  *  *  *  * 
        // *  *  *  *  *  * 
        // *  *  *  *  *  * 
        // *  *  *  *  *  *
        for(int row = 1; row <= n; row++){
            for(int column = 1; column<=m; column++){
                System.out.print(" * ");
            }System.out.println();
        }
    }

    public static void hollowRectangle(int n, int m){

        // *  *  *  *  *  * 
        // *              * 
        // *              * 
        // *              * 
        // *  *  *  *  *  *
        for(int row = 1; row <= n; row++){
            for(int column = 1; column<=m; column++){
               if(row==1||row==n||column==1||column==m){
                System.out.print(" * ");
               }else{ 
                System.out.print("   ");
               }
            }System.out.println();
        }
    }
    public static void rightAngleTrianglePattern(int n){
        
        // * 
        // *  * 
        // *  *  * 
        // *  *  *  * 
        // *  *  *  *  * 
                       
        for(int row = 1; row<=n; row++){
            for(int column = 1; column<=row; column++){
                System.out.print(" * ");
            }System.out.println();
        }
    }

    public static void rightAngleTrianglePattern2(int n){
        
        //              * 
        //           *  * 
        //        *  *  * 
        //     *  *  *  * 
        //  *  *  *  *  *
                       
        for(int row = 1; row<=n; row++){
            for(int column = 1; column<=n-row; column++){
                System.out.print("   ");
            }
            for(int column = 1; column<=row; column++){
               
                System.out.print(" * ");
               
            }System.out.println();
        }
    }
    public static void rightAngleTriangleHollowPattern2(int n){

        //              * 
        //           *  * 
        //        *     * 
        //     *        * 
        //  *  *  *  *  *
                       
        for(int row = 1; row<=n; row++){
            for(int column = 1; column<=n-row; column++){
                System.out.print("   ");
            }
            for(int column = 1; column<=row; column++){
                if(row==1||row==n||column==1||column==row){
                System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }System.out.println();
        }
    }
    public static void rightAngleTriangleHollowPattern(int n){
        
        // * 
        // *  * 
        // *     * 
        // *        * 
        // *  *  *  *  * 
                       
        for(int row = 1; row<=n; row++){
            for(int column = 1; column<=row; column++){
                if(row==1||row==n||column==1||column==row){
                System.out.print(" * ");}else{System.out.print("   ");}
            }System.out.println();
        }
    }
    public static void rightAngleTrianglePattern1(int n){
        // *  *  *  *  * 
        // *  *  *  * 
        // *  *  * 
        // *  * 
        // *

        for(int row = n; row>=1; row--){
            for(int column = 1; column<=row; column++){
                System.out.print(" * ");
            }System.out.println();
        }
    }

    public static void rightAngleHollowTrianglePattern1(int n){
        // *  *  *  *  * 
        // *        * 
        // *     * 
        // *  * 
        // *

        for(int row = n; row>=1; row--){
            for(int column = 1; column<=row; column++){
                if(row==1||row==n||column==1||column==row){
                System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }System.out.println();
        }
    }

    public static void rightAngleTrianglePattern3(int n){
        // *  *  *  *  * 
        //    *  *  *  * 
        //       *  *  * 
        //          *  * 
        //             *

        for(int row = n; row>=1; row--){
            for(int column = 1; column<=n-row;column++){
                System.out.print("   ");
            }
            for(int column = 1; column<=row; column++){
                System.out.print(" * ");
            }System.out.println();
        }
    }
    public static void rightAngleHollowTrianglePattern3(int n){
        // *  *  *  *  * 
        //    *        * 
        //       *     * 
        //          *  * 
        //             *

        for(int row = n; row>=1; row--){
            for(int column = 1; column<=n-row;column++){
                System.out.print("   ");
            }
            
            for(int column = 1; column<=row; column++){
                if(row==1||column==1||row==n||column==row){
                 System.out.print(" * ");
                }else{
                System.out.print("   ");
            }

            }System.out.println();
        }
    }
    public static void main(String[] args) {

        int n = 5;
        int m = 6;

        //call your desired function as " function_name(parameters)" or mentioned below

       
        hollowRectangle(n,m);


        
    }
}
