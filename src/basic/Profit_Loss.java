package basic;

import java.util.Scanner;
public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price : ");
        int cp = sc.nextInt();
        System.out.print("Enter Selling price : ");
        int sp = sc.nextInt();
        if(sp > cp){
            System.out.println("Profit is :"+ (sp-cp));
        } else if( sp == cp) {
            System.out.println("No Profit No Loss");
        } else{
            System.out.println("Loss is : "+ (cp-sp));
        }
    }
}
