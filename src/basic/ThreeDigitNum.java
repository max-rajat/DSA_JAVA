import java.util.Scanner;
public class ThreeDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        if(num > 99 && num < 1000){
            System.out.println("It's a three Digit Num");
        }else{
            System.out.println("Not a three digit number");
        }
    }
}
