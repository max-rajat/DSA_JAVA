//finding n is composite no or not
import java.util.Scanner;
public class Composite_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int i;
        for(i=2; i<=n-1;i++){
            if(n%i ==0){
                System.out.println( n +" is Composite no");
                break;
            }
        }
        System.out.println("Not Composite no");
    }
}
