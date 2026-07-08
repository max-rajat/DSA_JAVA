package Composite_Patterns;

import java.util.Scanner;

public class numberPyramidPlaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter no of rows : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.printf(" " + " ");
            }
            for(int j=1; j<=i;j++){
                System.out.printf(j + " ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.printf( j + " ");
            }
            System.out.println();
        }
    }
}
