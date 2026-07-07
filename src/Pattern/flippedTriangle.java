package Pattern;

import java.util.Scanner;

public class flippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int n =sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1; j<=n;j++){
              if(i+j>n){
                  System.out.printf("*" + " ");
              }else{
                  System.out.printf(" " + " ");
              }
            }System.out.println();
        }

    }
}
