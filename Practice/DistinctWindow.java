package Practice;
import java.util.*;
public class DistinctWindow {
    static void countDistinct(int arr[], int K) {
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
        // Traverse the first window and store count of every element in hash map
        for (int i = 0; i < K; i++)
            hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);
        // Print count of first window
        System.out.println(hM.size());
        // Traverse through the remaining array
        for (int i = K; i < arr.length; i++) {
            // Remove first element of previous window If there was only one occurrence
            if (hM.get(arr[i - K]) == 1) {
                hM.remove(arr[i - K]);
            }
            else // reduce count of the removed element
                hM.put(arr[i - K], hM.get(arr[i - K]) - 1);
            // Add new element of current window
            // If this element appears first time, set its count as 1,
            hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);
            System.out.print(hM.size());
        }
    }
    public static void main(String arg[]) {
        int arr[] = { 1, 2, 1, 3, 4, 2, 3 };
        int K = 4;
        countDistinct(arr, K);
    }
//        // Counts distinct elements in window of size K
//        static int countWindowDistinct(int win[], int K) {
//            int dist_count = 0;
//            // Traverse the window
//            for (int i = 0; i < K; i++) {
//                // Check if element arr[i] exists in arr[0..i-1]
//                int j;
//                for (j = 0; j < i; j++)
//                    if (win[i] == win[j])
//                        break;
//                if (j == i)
//                    dist_count++;
//            }
//            return dist_count;
//        }
//        // Counts distinct elements in all windows of size K
//        static void countDistinct(int arr[], int N, int K) {
//            // Traverse through every window
//            for (int i = 0; i <= N - K; i++)
//                System.out.println(countWindowDistinct(
//                        Arrays.copyOfRange(arr, i, arr.length), K));
//        }
//        // Driver's code
//        public static void main(String args[]) {
//            int arr[] = {1, 2, 1, 3, 4, 2, 3}, K = 4;
//            // Function call
//            countDistinct(arr, arr.length, K);
//        }
}
