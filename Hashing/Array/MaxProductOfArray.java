package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProductOfArray {
    //input
    //7
    //1 2 3 4 5 6 7 = 6 * 7 = 42
    //output
    //42
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }


        Arrays.sort(arr);
        int max = Math.max(arr[0]*arr[1], arr[n-1]*arr[n-2]);
        System.out.println(max);

    }
}
