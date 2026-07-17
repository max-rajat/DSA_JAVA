package Array.PracticeQue;

public class MinInArray {
    public static void main(String[] args) {
        int [] arr = {54,33,65,900,800,12,69};
        int mi= Integer.MAX_VALUE;
        for (int i=0;i<=arr.length-1;i++){
            mi=Math.min(mi,arr[i]);

        }
        System.out.println(mi);
    }
}
