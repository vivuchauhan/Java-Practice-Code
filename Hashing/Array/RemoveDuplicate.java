package Array;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        //output- 1,2,3,4,5,0,0,0
        // method for shorted array
        // without newArray
//        int[] arr = {1, 2, 2, 3, 3, 4, 4, 5};
//        int j = 0;
//        for (int i = 0; i<arr.length-1; i++) {
//            if (arr[i] != arr[i + 1]) {
//                arr[j] = arr[i];
//                j++;
//            }
//        }
//        arr[j] = arr[arr.length-1];
//        for (int i = 0; i < j+1; i++) {
//            System.out.print(arr[i] + " ");
//        }

        int[] arr = {1, 2, 2, 3, 3, 4, 4, 5};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs);
//        for(int no:hs){
//            System.out.print(no+" ");
//        }


//        int[] arr={1,2,2,3,3,4,4,5};
//        //output- 1,2,3,4,5,0,0,0
//        // method for shorted array
//        int[] newArr=new int[arr.length];
//        int j=0,temp=0;
//
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]!=arr[i+1]){
//                newArr[j]=arr[i];
//                j++;
//            }
//        }
//        newArr[j]=arr[arr.length-1];
//        for(int i=0;i<newArr.length;i++){
//            System.out.print(newArr[i]+" ");
//        }
    }
}
