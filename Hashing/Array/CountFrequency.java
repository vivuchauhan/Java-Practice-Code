package Array;
import  java.util.*;
public class CountFrequency {
    //Time Complexity : O(n)
    //Auxiliary Space : O(n)
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

      //  int[] arr={1,2,3,4,2,2,3,1};
//        int freq[]=new int[arr.length];
//        int visited=-1;
//        for(int i=0;i<arr.length;i++){
//            int count=1;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                    freq[j]=visited;
//                }
//                if(freq[i] !=visited){
//                    freq[i]=count;
//                }
//            }
//        }
//        for(int i=0;i<freq.length;i++){
//            if(freq[i]!=visited){
//                System.out.println(arr[i]+"->"+freq[i]);
//            }
//        }
    }
}
