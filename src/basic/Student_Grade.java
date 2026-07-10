package basic;

import java.util.Scanner;
public class Student_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Marks : ");
        int marks = sc.nextInt();

        if(marks >= 81){
            System.out.printf("Very Good ");
        } else if(marks >= 61 && marks <= 80) {
            System.out.printf("Good");
        } else if(marks >= 41 && marks <= 60) {
            System.out.printf("Average");
        }else{
            System.out.printf("Fail");
        }
    }
}
