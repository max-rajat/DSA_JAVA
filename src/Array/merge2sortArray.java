package Array;

public class merge2sortArray {
    public static void main(String[] args) {
        int[] a={1,3,5,7,9,11,78};
        int[] b={2,4,6,8,80};
        int[] c= new int [a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        if(i==a.length){ //now take elements form b only
            while (j<b.length){
                c[k]=b[j];
              j++;k++;
            }
        }
        if(j==b.length){ //now take elements form a only
            while (i<a.length){
                c[k]=b[i];
                i++;k++;
            }
        }
        for(int ele :c){
            System.out.printf(ele +" ");
        }
    }
}
