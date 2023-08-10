package Practice;

public class FindKthElement {
    public static void main(String[] args) {
        int[] arr={10,9,6,8,12,16};
        int k=3;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==k-1){
                System.out.print(k+"->"+arr[i]);
                break;
            }
        }
    }
}
