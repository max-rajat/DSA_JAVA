package Pattern;
import java.util.Scanner;
public class Reverse_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter no of row : ");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n+1-i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
