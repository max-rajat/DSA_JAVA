package Pattern;
import java.util.Scanner;
public class Squar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter value of n : ");
        int n = sc.nextInt();
        int i,j;
        for(i=1; i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
