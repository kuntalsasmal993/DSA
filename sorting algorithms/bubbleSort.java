// tc = O(n)
public class bubbleSort {

    static void printArr(int arr[]){
          for(int i =0; i< arr.length; i++ ){
            System.out.print(arr[i]+",");
          }  
    }
    
    public static void main(String[] args) {

        int arr[] = {2, 6, 9, -1, 4, 3, 18, 7};

        for(int i =0; i< arr.length-1; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tempp;
                    tempp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tempp;
                }
            }
        }
        printArr(arr);
    }
}
