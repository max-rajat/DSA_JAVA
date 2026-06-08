package Pattern;
import java.util.*;
public class Reverse_Alphbate_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no Rows : ");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n+1-i;j++){
                System.out.print((char)(j+64)+(" "));
            }
            System.out.println();
        }
    }

}
