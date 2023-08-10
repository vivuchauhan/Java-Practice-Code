package Array;

import java.util.Scanner;

public class FindMissingElement {
    public static void main(String[] args) {
        /* input
            length=5;
            1,2,4,5
            output missing ele is 3
            3
        */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a1=0;
        for(int i=1;i<=n;i++){
            a1=a1+i;
        }
        int[] arr=new int[n];
        int a2=0;
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            a2=a2+arr[i];
        }
        int element=a1-a2;
        System.out.println(element);
    }
}
