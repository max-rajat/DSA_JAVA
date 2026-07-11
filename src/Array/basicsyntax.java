package Array;

public class basicsyntax {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 22;
        arr[1] = 34;
        arr[2] = 98;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr[1] = 54;
        System.out.println("value of index 1 is changed");
        System.out.println(arr[1]);

    }

}