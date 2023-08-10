package Array;
import java.util.*;
public class TargetSumPair {
    //mock dsa1 medium5 time comlexity O(n2)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + "," + arr[j]);
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("pair not fount");
        }
    }
}
// timr colexity O(n)
//    public static void Sumpair(int[] arr,int x){
//        //arr{1 2 3 4 5 6}
//        int l=0;
//        int h=arr.length-1;
//        int count=0;
//        while(l<=h){
//            if((arr[l]+arr[h])>x){
//                h--;
//            }else if((arr[l]+arr[h])<x){
//                l++;
//            }else if((arr[l]+arr[h]==x)){
//                System.out.println(arr[l]+","+arr[h]);
//                l++;
//                h--;
//                count++;
//            }
//        }
//        if(count==0){
//            System.out.println("Pair not found");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        int x=sc.nextInt();
//        Sumpair(arr,x);
//    }
//}

