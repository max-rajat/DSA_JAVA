package Pattern;
import java.util.Scanner;
public class Alphabate_Triangle {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.printf("Enter no of Rows : ");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.println((char)(j+64));
            } System.out.println();
        }
    }
}
