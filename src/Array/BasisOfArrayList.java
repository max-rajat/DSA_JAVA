package Array;

import java.util.ArrayList;

public class BasisOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new  ArrayList<>(6);
        arr.add(0,10); //initialise
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr.size());
        System.out.println(arr);
        for(int i=0;i<=5;i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr.set(3,400); //modify the value of 4th index
        for(int i=0;i<=arr.size()-1;i++){
            System.out.println(arr.get(i)+ " ");
        }
        System.out.println();
        arr.add(90); //push back putting 90 to the end of the liat
        System.out.println(arr.size());
        for(int i=0;i<=arr.size()-1;i++){
            System.out.println(arr.get(i)+ " ");
        }
    }
}
