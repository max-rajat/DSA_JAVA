package Composite_Patterns;

import java.util.Scanner;

public class starPyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter no of rows : ");
        int n = sc.nextInt();
        int nsp=n-1;
        int nst=1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<nsp;j++){
                System.out.printf(" " + " ");
            }
            for(int j=1;j<=nst;j++){
                System.out.printf("*" + " ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
}
