package Array;

import java.util.HashMap;
public class LongestSubArray {
     static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            } else if (hm.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - hm.get(sum - k));
            }
        }
        return maxLen;
//         public static void main(String[] args) {
//            // Your code here
//           Scanner sc = new Scanner(System.in);
//            int t = sc.nextInt();
//            while (t-- != 0) {
//                int n = sc.nextInt();
//                int k = sc.nextInt();
//                int[] arr = new int[n];
//                for (int i = 0; i < n; i++) {
//                    arr[i] = sc.nextInt();
//                }
//                System.out.println(longestSubarray(arr, k));
//            }
        //}
    }

    public static void main(String[] args) {

    }
}
