package Array.PracticeQue;
//Calculate the sum of all the elements in the given
//array
import java.util.Scanner;
public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            System.out.print("enter element : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<=arr.length-1;i++){
            sum+= arr[i];

        }
        System.out.println(sum);
    }
}
