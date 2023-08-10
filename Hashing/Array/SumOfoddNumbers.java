package Array;

import Linkedlist.PrintListAndLength;

import java.util.*;

public class SumOfoddNumbers {
    public static void Printsum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){  //input 5 -> 1,2,3,4,5 -> 1+3+5=9 ans
               sum=sum+i;
            }
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         Printsum(n);

    }
}
