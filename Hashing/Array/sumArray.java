package Array;

public class sumArray {
    static int sumarray(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{100,200,300,400,500};
        System.out.println(sumarray(arr));
    }
}
