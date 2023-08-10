package Practice;

import java.util.*;

public class WaveArray {
    public static void main(String[] args) {
        //input
        // 6
        //1 2 3 4 5 6
        //output
        //2 1 4 3 6 5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=1; i<n;i=i+2){
            System.out.print(arr[i]+" "+arr[i-1]+" ");
        }
        if(n%2!=0){
            System.out.println(arr[n-1]);
        }
    }
}
