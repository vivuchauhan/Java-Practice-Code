package Array;

public class MaxElementOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 30,3, 4, 5, 6,7,8,12,15};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}