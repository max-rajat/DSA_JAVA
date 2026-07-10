//display this AP - 1,3,5,7,9 ..... upto "n" terms
import java.util.Scanner;
public class Arithmetic_progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter n term : ");
        int n = sc.nextInt();
        int i;
        for(i=1;i<=2*n-1; i+=2){
            System.out.println(i);
        }
    }
}
