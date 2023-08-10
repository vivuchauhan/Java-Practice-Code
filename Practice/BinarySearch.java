package Practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={10,13,15,20,25,30,40,50,70};
        int t=40;
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(t>arr[m]){
                l=m+1;
            }else if(t<arr[m]){
                h=m-1;
            }else{
                System.out.println(m);
                return;
            }
        }
        System.out.println(-1);
    }
}
