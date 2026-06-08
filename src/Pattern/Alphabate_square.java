package Pattern;
import java.util.Scanner;
public class Alphabate_square {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.printf("enter value of n : ");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print((char)(j+64) +" ");
            }
            System.out.println();
        }
    }
}
