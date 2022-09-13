public class Qs {

    public static int arrayPartition(int arr[], int low, int high){

        int pivot = arr[high];
        int i =low - 1;

        for(int j = low; j< high; j++){            
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        
        return i;
    }
    
    public static void quickSort(int arr[], int low, int high){

        if(low < high){
            int pivot_idx = arrayPartition(arr, low, high);

            quickSort(arr, low, pivot_idx-1);
            quickSort(arr, pivot_idx+1, high);

        }
    }
    public static void main(String[] args) {
        int arr[] = {7, 6, 9, -1, 4, 3, 18, 2};
        int n = arr.length;
        
        quickSort(arr, 0, n-1);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
            }
}
