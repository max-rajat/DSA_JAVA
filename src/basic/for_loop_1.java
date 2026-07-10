package basic;

//print hello world n times Take n as input from user
import java.util.Scanner;
public class for_loop_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n : ");
        int n = sc.nextInt();
        int i;

        for(i=1; i <= n; i++){
            System.out.println(i + ". Hello world" );
        }
    }
}
