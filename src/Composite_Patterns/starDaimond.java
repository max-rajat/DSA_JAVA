package Composite_Patterns;

import java.util.Scanner;

public class starDaimond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter no of rows : ");
        int n = sc.nextInt();
        int nsp=n-1;
        int nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.printf(" " + " ");
            }
            for(int j=1;j<=nst;j++){
                System.out.printf("*" + " ");
            }
            nsp--;
            nst +=2;
            System.out.println();
        }
        nsp=1;
        nst=nst-4;
        for(int i=1; i<=n-1;i++){
            for(int j=1;j<=nsp;j++){
                System.out.printf(" " + " ");
            }
            for(int j=1;j<=nst;j++){
                System.out.printf("*" + " ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }
}
