public class HeapSort {
    public static void heapify(int arr[], int size, int index){
        int largest = index;
    int left_child = 2*index;
    int right_child  = 2*index+1;

    if(left_child <= size && arr[largest]<arr[left_child]){
        largest = left_child;
    }
    if(right_child <= size && arr[largest]<arr[right_child]){
        largest = right_child;
    }

    if(largest != index){
        int temp = arr[largest];
        arr[largest] = arr[index];
        arr[index] = temp;

        heapify(arr, size, largest);
    }
    }

    public static void heapSort(int arr[], int size){
        while(size>1){
            
            int temp = arr[size];
            arr[size] = arr[1];
            arr[1] = temp;

            size--;

            heapify(arr, size, 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {-1, 54, 53, 55, 52, 50};
        int size = 5;

        for(int i= size/2; i > 0 ; i--){
            heapify(arr, size, i);
        }

        System.out.println("........................after heapify..........................");

        for(int i = 1; i <= size; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        heapSort(arr, size);

        System.out.println("...............SORTED HEAP...............");

        for(int i = 1; i <= size; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}
