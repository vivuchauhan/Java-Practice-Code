package Hashing;

import java.util.HashMap;
import java.util.*;

public class CountFrequency {
    public static void main(String[] args) {
        //count Frequency of element
        int[] arr={1,2,3,4,2,2,3,1};
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for(Map.Entry entry:hm.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }


//        String[] str={"A","A","A","B","B","C","C","C","d"};
//        HashMap<String,Integer> map=new HashMap<>();
//
//        for(int i=0;i<str.length;i++){
//            if(map.containsKey(str[i])){
//                map.put(str[i], map.get(str[i])+1);
//            }else{
//                map.put(str[i],1);
//            }
//        }
//        for(Map.Entry entry:map.entrySet()){
//            System.out.println(entry.getKey()+"->"+entry.getValue());
//        }
    }
}
