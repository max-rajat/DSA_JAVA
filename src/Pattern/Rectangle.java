package Pattern;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter no of row : ");
        int row = sc.nextInt();
        System.out.printf("Enter no of Columns : ");
        int col = sc.nextInt();
        int i,j;
        for(i=1; i<=row;i++){
            for(j=1;j<=col;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
