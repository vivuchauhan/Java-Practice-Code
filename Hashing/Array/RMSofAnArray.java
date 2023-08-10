package Array;

import java.util.Scanner;

public class RMSofAnArray {
    public static void main(String[] args) {
        //first way
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        Double Root=0.0,ans=0.0;
//        int[] arr=new int[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//            Root+=arr[i]*arr[i];
//        }
//        Root /=n;
//        ans=Math.sqrt(Root);
//        System.out.printf("%.6f",ans);
        //second way
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Double sum=0.0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            arr[i]=arr[i]*arr[i]; // i^2
            sum=sum+arr[i];  //1^2 + 2^2 + 3^2 +.....n^2
        }
        Double mean=sum/n;
        Double Root=Math.sqrt(mean);
        System.out.printf("%.6f",Root);
    }
}
