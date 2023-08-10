package Practice;

public class MaxOccurences {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,9,3,3,4,2};
        int maxCount=0;
        int element=0;
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(maxCount<count){
                maxCount=count;
                element=arr[i];
            }
        }
        System.out.println(element+"->"+maxCount);
    }
}