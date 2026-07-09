package Composite_Patterns;

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter no of rows : ");
        int n = sc.nextInt();
        int nsp=1;
        for(int i=1;i<=n*2-1;i++){ //1st rows
            System.out.print( i +" ");
        }
        System.out.println();
        n--;
        for(int i=1;i<=n;i++){ // row
            int a=1;
           for(int j=1;j<=n+1-i;j++){ //numbers
               System.out.printf(a++ + " ");
           }
           for(int j=1;j<=nsp;j++){
               System.out.printf(" " + " ");
               a++;//important
           }
           nsp+=2;
           for(int j=1;j<=n+1-i;j++){
               System.out.printf(a++ + " ");
           }System.out.println();
        }
    }
}
