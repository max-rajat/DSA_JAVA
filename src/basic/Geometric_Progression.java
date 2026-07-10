package basic;

// display GP-1,2,4,8,16.... upto 'n' terms
import java.util.Scanner;
public class Geometric_Progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n term : ");
        int n = sc.nextInt();
        int i;
        int a=1;
        for(i=1;i<=n;i++){
            System.out.println(a);
            a*=2;
        }
    }
}
