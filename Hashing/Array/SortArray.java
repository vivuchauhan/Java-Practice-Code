package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<arr.length;i++){
//           arr[i]=sc.nextInt();
//        }
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)+" ");
    }
}
