import java.util.Scanner;
/*import java.util.Arrays;

public class matrix {

  public static void main(String[] args) {
    // declare and initialize a 3x3 matrix
    int matrix[][] = 
      { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    
    // display 2D array using for-each loop
    //System.out.println(Arrays.deepToString(matrix)); 
    System.out.println(Arrays.toString(matrix[0])); 
    System.out.println(Arrays.toString(matrix[1])); 
    System.out.println(Arrays.toString(matrix[2])); 
    
  }

}*/

public class matrix{
    public static void main(String[] args) {
        int rows, columns;
        int matRix[][] = {};
        Scanner sc  = new Scanner(System.in);

        System.out.println("enter size of rows: ");
        rows = sc.nextInt();

        System.out.println("enter size of rows: ");
        columns = sc.nextInt();

        
        for(int i = 1; i<= rows; i++){

            for(int j = 1; j<= columns; j++){
                System.out.println("enter value of element "+i+" "+j);
                matRix[i][j] = sc.nextInt();
            }

        }
        System.out.println(matRix);
    }
}