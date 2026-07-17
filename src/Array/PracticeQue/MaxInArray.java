package Array.PracticeQue;

public class MaxInArray {
    public static void main(String[] args) {
        int [] arr ={1,9,-200,};
        int mx=Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1;i++){
//            if(arr[i]>mx){
//                mx=arr[i];
//            }
            mx=Math.max(mx,arr[i]);
        }
        System.out.println(mx);

    }
}
