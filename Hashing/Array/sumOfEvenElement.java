package Array;

import java.util.Scanner;

public class sumOfEvenElement {
    public static void main(String[] args) {
        //Given an integer n and the n integers that follows.
        // Find the sum of the even elements present in the array.
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum=0;
//        int [] arr=new int[n];
//        for(int i=0; i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0; i<n;i++){
//            if(arr[i]%2==0){
//                sum=sum+arr[i];
//            }
//        }
//        System.out.println(sum);
        int[] arr={1,2,3,4,5,6};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        }
        System.out.print(sum);
    }
}
