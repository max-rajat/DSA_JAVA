package Pattern;

import java.util.Scanner;
public class Number_Triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.printf("enter no n : ");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.printf(j+" ");
            }
            System.out.println();
        }
    }
}
