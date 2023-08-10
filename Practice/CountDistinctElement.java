package Practice;

import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String[] args) {
        //count distinct element
        int[] arr={4,3,2,2,1,3,1,4,5,5,6,7};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs);//hs.size();->7
//        for(int no:hs){
//            System.out.print(no+" ");
//        }
    }
}
