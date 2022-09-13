public class HeapInsertion {

        int[] arr = new int[100];
        int size = 0;
        int index;
        
    public void insert(int number){
            //tc = O(logn)

        arr[0] = -1;
        size = size+1;
        index = size;
        arr[index] = number;

        while(index > 1){
            int parent = index/2;
            if(arr[parent] < arr[index]){
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;

                index = parent;

            }else{
                return;
            }
        }
    }
    public void delete(){
            //tc = O(logn)

        //step1
        arr[1] = arr[size];
        size--;

        // step2
        int i = 1;
        while(i<size){
            int leftindex = 2*i;
            int rightindex = 2*i+1;
            if(leftindex<size && arr[i]<arr[leftindex]){
                int temp = arr[i];
                arr[i] = arr[leftindex];
                arr[leftindex] = temp;
                
                i = leftindex;
            }else if(rightindex<size && arr[i]<arr[rightindex]){
                int temp = arr[i];
                arr[i] = arr[rightindex];
                arr[rightindex] = temp;
                

                i = rightindex; 
        }else{
            return;
        }
    }
}

public static void heapify(int arr[], int size, int index){

    // tc of heapify o(log n)

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
    void printHeap(){
        for(int i = 1; i<=size; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        HeapInsertion heap = new HeapInsertion();

        heap.insert(50);
        heap.insert(55);
        heap.insert(53);
        heap.insert(52);
        heap.insert(54);

        heap.delete();
        

        heap.printHeap();
        System.out.println();

        int arr[] = {-1, 54, 53, 55, 52, 50};
        int size = 5;

        for(int i= size/2; i > 0 ; i--){
            heapify(arr, size, i);
        }

        System.out.println("after heapify..........................");

        for(int i = 1; i <= size; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();

        
    }
}
