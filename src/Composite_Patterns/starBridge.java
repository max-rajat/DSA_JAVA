package Composite_Patterns;

import java.util.Scanner;

public class starBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter no of rows : ");
        int n = sc.nextInt();
        for(int i=1;i<=n*2-1;i++){
            System.out.printf("*" + " ");
        }
        System.out.println();
        n--;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){ //stars
                System.out.printf("*" + " ");
            }
            for(int j=1; j<=2*i-1;j++){ //spaces
                System.out.printf(" "+ " ");
            }
            for(int j=1;j<=n+1-i;j++){
                System.out.printf( "*" + " ");
            }
            System.out.println();
        }
    }
}
