package basic;

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle : ");
        double len = sc.nextDouble();
        System.out.print("Enter Breadth of Rectangle : ");
        double bre = sc.nextDouble();

        double area= len * bre;
        double perimeter= 2*(len + bre);
        System.out.println("Area of Rectangle is : "+ area);
        System.out.println("perimeter of Rectangle is : "+ perimeter);

        if(area > perimeter){
            System.out.print(" Area is greater than perimeter");
        } else if(area == perimeter) {
            System.out.println("Boths are equal");
        }else{
            System.out.print("Perimeter is greater than Area");
        }
    }
}
