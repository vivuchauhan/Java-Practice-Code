package Practice;
import java.util.*;
public class PairsSumANumber {
    public static void Sumpair(int[] arr,int x){
        //arr{1 2 3 4 5 6}
        int l=0;
        int h=arr.length-1;
        int count=0;
        while(l<=h){
            if((arr[l]+arr[h])>x){
                h--;
            }else if((arr[l]+arr[h])<x){
                l++;
            }else if((arr[l]+arr[h]==x)){
                System.out.println(arr[l]+","+arr[h]);
                l++;
                h--;
                count++;
            }
        }
        if(count==0){
            System.out.println("Pair not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        Sumpair(arr,x);
         }
}
