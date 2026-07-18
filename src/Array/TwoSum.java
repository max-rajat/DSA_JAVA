package Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {8,5,2,6,9};
        int x=7;
        int[] ans = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == x){
                    ans[0]=i;
                    ans[1]=j;
                    System.out.println(i +" "+j);
                }
            }
        }
    }
}
