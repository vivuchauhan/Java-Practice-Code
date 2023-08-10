package Array;

import java.util.*;

public class SearchNumber {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//
//        int[] number=new int[size];
//        for(int i=0;i<size;i++){
//            number[i]=sc.nextInt();
//        }
//        int x=sc.nextInt();
//
//        for(int i=0;i<number.length;i++){
//            if(number[i]==x){
//                System.out.println(i);
//            }
//        }
        int arr[]={1,3,5,6,8,7};
        int x=6;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println(i);
            }
        }

    }
}
//input
//6
//1 2 3 4 5 7
//find this num
//7
//index
//5