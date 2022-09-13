/*                  PROGRAM FOR MERGE SORT
 It's TIME COMPLEXITY is O(log n)
 it is best for link list;
 */

import java.util.Scanner;

public class Ms{

    public static void conquer(int arr[], int si, int mid, int ei){

        int merg[] = new int[(ei-si)+1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei){

            if(arr[idx1]<=arr[idx2]){
                merg[x]=arr[idx1];
                x++; idx1++;
            }else{
                merg[x] = arr[idx2];
                x++; idx2++;

            }
        }
        while(idx1<=mid){
            merg[x++] = arr[idx1++];
        }
        while(idx2<=ei){
            merg[x++] = arr[idx2++];
        }

        for(int i = 0, j = si; i<merg.length; i++, j++){
            arr[j] = merg[i];
        }
    }

    public static void divide(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = si + (ei-si)/2;

        divide(arr, si , mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter numberes of element in the array: ");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int arr[] = new int[n];
        

        System.out.println("........................ENTER ARRAY ELEMENTS.....................");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        divide(arr, 0, n-1);
        System.out.println("SORTED ARRAY IS");

        for(int i = 0; i<n; i++){
                    
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}