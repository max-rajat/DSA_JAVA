import java.util.Scanner;
public class IstriangleorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a");
        int a =sc.nextInt();

        System.out.printf("Enter b");
        int b =sc.nextInt();

        System.out.printf("Enter c");
        int c =sc.nextInt();
        if((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.printf("Valid triangle ");
        }else{
            System.out.printf("Invalid Triangle");
        }

    }
}
