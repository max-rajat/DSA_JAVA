//display Ap = 4,7,10.13, .... upto 'n' term without using mathematical formula
import java.util.Scanner;
public class Ap_without_formula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n term : ");
        int n = sc.nextInt();
        int i;
        int a=4;
        for(i=1;i<=n;i++){
            System.out.println(a);
            a+=3;
        }
    }
}
