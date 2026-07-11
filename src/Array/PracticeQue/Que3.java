package Array.PracticeQue;
//Find the element ‘x’ in the array . Take array
//and x as input
import java.util.Scanner;
public class Que3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println(" enter size of array");
        int size = sc.nextInt();

        int [] arr =new int[size];
        System.out.println("Enter target element");
        int x = sc.nextInt();
        for(int i=0;i<=arr.length-1; i++){
            System.out.println("enter element ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==x){
                System.out.println("Target found : " + x + " at index : " + i);
            }
        }

    }
}
