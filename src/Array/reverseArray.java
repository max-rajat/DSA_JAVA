package Array;
import java.util.Arrays;
public class reverseArray {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50,60};
        int n=arr.length;
        for ( int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        //reverse
//        for(int i=0;i<n/2;i++){
//            int j= n-1-i;
//            int temp =arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }

        // reverse using twopointer concept
        int left=0;
        int right=n-1;
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
