package Practice;

public class SortOddNumberOnly {
    public static void sortonlyOdd(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            if (arr[i] % 2 != 0) {
                int j = i + 1;
                int k = i;
                while (j < arr.length) {
                    if (arr[j] < arr[k] && arr[j] % 2 != 0) {
                        int temp = arr[j];
                        arr[j] = arr[k];
                        arr[k] = temp;
                    }
                    j++;
                }
            }
        }
    }
    public static void main(String[] args) {
    //Only odd numbers sorted. even numbers remain at the same position.
    // Using Bubble+Merge Sort arr[] = {2,4,1,5,-1,7};
    // output: 2 4 -1 1 5 7
    // example 2: arr[] = {2,4,1,5, 6, -1,7,8};
    // 2 4 -1 1 6 5 7 8"
        int[] arr = {2,4,1,5,-1,7};
        sortonlyOdd(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
