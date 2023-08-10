package Array;

import java.util.HashMap;
import java.util.Map;

public class CountFreqAfterKthEle {
    public static void countFreq(int arr[],int n) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=n+1;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,10};
        int n=4;
        countFreq(arr,n);
    }
}
