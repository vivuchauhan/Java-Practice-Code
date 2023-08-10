package Array;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] arr={7,8,1,2,3,4,5};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
//        Arrays.sort(arr);
        int k=2;
        System.out.print(arr[k-1]+" ");
    }
}
