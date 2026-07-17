package Array.PracticeQue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BuiltInMethods {
    public static void main(String[] args) {
        int [] arr = {2,4,6,9,1,5,8,3,7};
        //for each loop
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }

    }

}
