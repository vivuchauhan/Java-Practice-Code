package Practice;
import java.util.*;
public class EvenOddSeperateSorting {
    public static void main(String[] args) {
        //print odd in descending order and Even in ascending order->9,7,5,3,1,2,4,6,8
        int[] arr={5,4,5,3,2,1,6,8,7,9};
        int n=arr.length;
        Arrays.sort(arr);
        for(int j=n-1;j>=1;j--){
            if(j%2!=0){
                System.out.print(j+" ");
            }
        }
        for(int i=1;i<n;i++){
             if(i%2==0){
                 System.out.print(i+" ");
                }
            }
    }
}
