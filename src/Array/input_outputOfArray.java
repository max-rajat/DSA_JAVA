package Array;
import java.util.Scanner;
public class input_outputOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr =new int[5];
        //input -> loop
        for(int i=0; i<=arr.length-1;i++){
            System.out.println("enter no ");
            arr[i]=sc.nextInt();
        }
        for (int i=0 ;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }

    }
}
