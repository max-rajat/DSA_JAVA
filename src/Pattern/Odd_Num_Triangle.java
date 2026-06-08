package Pattern;
import java.util.Scanner;
public class Odd_Num_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter no Rows : ");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                    System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }
    }
}
