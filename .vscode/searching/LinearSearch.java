public class LinearSearch {

    public static int lineaarSearch(int arr[],int N){
        for(int i = 0; i < arr.length; i++){

            if(arr[i] == N){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 6, 9, -1, 4, 3, 18, 7};
    int N =7;
    int result = lineaarSearch(arr,N);

    if(result == -1){
        System.out.println("element not present..............................");
    }else{
        System.out.println(result+1);
    }
    }
}
