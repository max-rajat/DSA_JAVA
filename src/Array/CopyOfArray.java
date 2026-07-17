package Array;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr ={20,40,28,54,33};
        for(int  ele: arr){
            System.out.printf(ele + " ");
        }
        System.out.println();

//        int [] num =arr; //shallow copy
//        num[0]=90;
//        System.out.println(arr[0]);
        int [] brr = Arrays.copyOf(arr,arr.length);
        brr[0]=80;
        System.out.println(arr[0]);
    }
}
