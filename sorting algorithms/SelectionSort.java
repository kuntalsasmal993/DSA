// tc = O(n)

public class SelectionSort {
    
    static void printArr(int arr[]){
        for(int i =0; i< arr.length; i++ ){
          System.out.print(arr[i]+",");
        }  
  }
  
  public static void main(String[] args) {

      int arr[] = {2, 6, 9, -1, 4, 3, 18, 7};

      for(int i =0; i< arr.length; i++){
        int smallest = i;
          for(int j = i+1; j<arr.length; j++){
              if(arr[smallest]>arr[j]){
                smallest = j;                 
            }
              }
              int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp; 
      }
      printArr(arr);
  }
}
