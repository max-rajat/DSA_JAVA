package Array.PracticeQue;
//Q1 : Given an array of marks of students, if the mark of any
//student is less than 35 print its roll number. [roll number
//here refers to the index of the array
public class Que1 {
    public static void main(String[] args) {
        int [] arr = {45,98,88,76,31,32,85,21,15};
                for(int i=0;i<=arr.length-1;i++){
                    if(arr[i]<35){
                        System.out.println("index : " + i + " and marks is : " + arr[i]);
                    }
                }
    }
}
