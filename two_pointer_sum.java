 import java.util.Arrays;

  //                    SUM OF TWO NUMBER 

/* public class two_pointer_sum { 

    public static void main(String[] args) {
        int arr[] = {-3, 2, 3, 3, 6, 8, 15};
        int target_number = 6;

        Arrays.sort(arr);
             int start = 0;
             int end = arr.length -1;
             int result[] = new int[2];

             while(start<end){
                int sum = arr[start]+arr[end];
                if(sum == target_number){
                    result[0] = start+1;
                    result[1] = end+1;
                    break;
                }else if(sum > target_number){end--;}
                else{start++;}
             }
             System.out.println(result[0]);
             System.out.println(result[1]);

    }
}*/

//                 SUM OF 3 NUMBER USING 2 POINTERS
public class two_pointer_sum{
    public static void main(String[] args) {
        int arr[] = {-3, 2, 3, 3, 6, 8, 15};
        int target_number = 17;

        Arrays.sort(arr);
             int start = 1;
             int end = arr.length -1;
             int result[] = new int[3];
            for(int i = 0; i<arr.length; i++){
             while(start<end){
                int sum = arr[i]+arr[start]+arr[end];
                if(sum == target_number){
                    result[0] = start+1;
                    result[1] = end+1;
                    result[2] = i+1;
                    break;
                }else if(sum > target_number){end--;}
                else{start++;}
             }}
             
             System.out.println(result[2]);
             System.out.println(result[0]);
             System.out.println(result[1]);


    }
}


