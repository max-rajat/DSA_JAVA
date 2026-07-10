// print tabel of n , take n from user ex=2,3,6
import java.util.Scanner;
public class Tabel_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no to print tabel : ");
        int n = sc.nextInt();
        int i;
        for(i=1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
