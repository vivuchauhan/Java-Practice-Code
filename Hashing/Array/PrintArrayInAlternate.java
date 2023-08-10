package Array;

public class PrintArrayInAlternate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};

        for(int i=1;i<arr.length;i+=2){
            System.out.print(i+" ");
        }
    }
}
