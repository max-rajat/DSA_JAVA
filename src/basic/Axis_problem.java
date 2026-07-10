package basic;

import java.util.Scanner;
public class Axis_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter X-axis : ");
        int x = sc.nextInt();
        System.out.printf("Enter y-axis : ");
        int y = sc.nextInt();

        // check for the origin
        if(x == 0 && y ==0){
            System.out.printf("This point is at the Origin (0,0)");
        }
        // check for axis
        else if(x == 0 ) {
            System.out.printf("Point lies on the Y-axis");
        }
        else if(y == 0 ) {
            System.out.printf("Point lies on the X-axis");
        }
        // Check Quadrants
        else if(x > 0  && y > 0) {
            System.out.printf("1st Quadrant");
        }
        else if(x < 0 && y > 0){
            System.out.printf("2nd Quadrant");
        }
        else if(x < 0 && y < 0) {
            System.out.printf("3rd Quadrant");
        }
        else{
            System.out.printf("4th Quadrant");
        }
    }
}
