package Hashing;

import java.util.HashSet;

public class CountDistinctElement {
    public static int countDistinct(int [] arr,int n){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,4,4,3,3,5,2,6,7};
        int n=arr.length;
        System.out.println(countDistinct(arr,n));
    }
}
