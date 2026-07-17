package Array.PracticeQue;

public class SecondMaxInArray {
    public static void main(String[] args) {
        int [] arr ={1,9,7,8,3,75,74,-200,};
        int mx=Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1;i++){
            mx=Math.max(mx,arr[i]);
        }
        int smx=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i] != mx){
                smx=Math.max(smx,arr[i]);

            }
        }
        System.out.println(smx);

    }
}
