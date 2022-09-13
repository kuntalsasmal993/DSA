public class BinarySearch {

    public static int partition(int arr[], int low, int high ){
        int i = low-1;
        int pivot = arr[high];

        for(int j = low; j<high; j++){
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
        if(low<high){
            int pivot_idx = partition(arr, low, high);

            quickSort(arr, low, pivot_idx-1);
            quickSort(arr, pivot_idx+1, high);
        }
    }

    public static int binarySearch(int arr[],int value, int low, int high){

        if(high>=low){

            int mid = low + (high-low)/2;
            if(value == arr[mid]){
                return mid;
            }else if(value < arr[mid]){
              return binarySearch(arr, value, low, mid-1);
            }else{
              return binarySearch(arr, value, mid+1, high);
            }
        }
            return -1; 
        }
    public static void main(String[] args) {
        int arr[] = {2, 6, 9, -1, 4, 3, 18, 7};
        int size = arr.length;
    int N = 14;
    quickSort(arr, 0, size-1);

    for(int i = 0; i<size; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    
    int result = binarySearch(arr, N, 0, size-1);

    if(result == -1){
        System.out.println("not present");
    }else{
        System.out.println(N+" is in "+(result+1)+" index ");
    }
    }
}
