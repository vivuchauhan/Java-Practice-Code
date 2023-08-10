package Practice;

import java.util.*;

public class KthElement {
    public static void main(String[] args) {
        // find kth Smallest element. k=3;
//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//
//        int[] arr=new int[size];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
        int[] arr={7,8,1,2,3,4,5};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
             int k=3;//sc.nextInt();
            System.out.print(arr[k-1]+" ");
        }
    }

