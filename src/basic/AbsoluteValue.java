package basic;

import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num =sc.nextInt();
        if(num<0){
            System.out.print(-num);
        }else{
            System.out.print(num);
        }
    }
}
