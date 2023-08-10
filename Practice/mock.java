package Practice;
import java.util.*;
public class mock {
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


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int x = sc.nextInt();
//        int l=0;
//        int h=arr.length;
//        int count=0;
//        while(l<=h){
//            if((l+h)<x){
//                l++;
//            }else if((l+h)>x){
//                h--;
//            }else{
//                System.out.println(l+","+h);
//                count++;
//                break;
//            }
//        }
//        if(count==0){
//            System.out.println("Pairs Not Found");
//        }
    }
}