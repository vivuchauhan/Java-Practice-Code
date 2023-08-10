package Array;

import java.util.HashMap;
import java.util.HashSet;

public class MissinNoByMapSet {
    // public static int getMissingEle(int[] a, int n) {
//        int sum = 1;
//        for (int i = 2; i <= (n+1); i++) {
//            sum+=i;
//            sum -= a[i-2];
//        }
//        return sum;
    public static int missingNumber(int[] nums) {
        int n = nums.length ;
        HashMap<Integer,Integer> mp = new HashMap<>() ;
        for(int i=0 ; i<n ; i++){
            int num = nums[i] ;
            mp.put(nums[i],nums[i]) ;
        }
        int ans = -1 ;
        for(int i=0 ; i<10000 ; i++){
            if(mp.containsKey(i)){
                continue ;
            }
            else{
                ans = i ;
                break ;
            }
        }
        return ans ;
    }
    //App 2 ->
    public static int missingNumber2(int[] nums) {
        int n = nums.length ;
        HashSet<Integer> myset = new HashSet<>() ;
        int ans =-1 ;
        for(int i=0 ; i<n ; i++){
            int a = nums[i] ;
            myset.add(a) ;
        }
        for(int i=0 ; i<10000 ; i++){
            if(myset.contains(i)){
                continue ;
            }
            else{
                ans = i ;
                break ;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int nums[] = {0,1, 2, 4, 6, 3, 7, 8};// N = 8;
        //   int N = nums.length;
        System.out.println(missingNumber(nums));
        System.out.println(missingNumber2(nums));
    }
}
