import java.sql.SQLOutput;
import java.util.Scanner;
public class Divisible_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        if(num % 5 == 0 || num % 3 == 0){
            System.out.print("Divisible by 5 or 3");
        }else{
            System.out.printf("Not divisible by 5 or 3 ");
        }
    }
}
