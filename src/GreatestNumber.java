import java.util.*;
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Num1 : ");
        int num1 = sc.nextInt();
        System.out.printf("Enter Num2 : ");
        int num2 = sc.nextInt();
        System.out.printf("Enter Num3 : ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3 ){
            System.out.printf(num1 + " is greater");
        }
        else if (num2 > num3 && num2 > num1){
            System.out.printf(num2 + " is greater");
        }else{
            System.out.printf( num3 + " is greater");
        }
    }
}
