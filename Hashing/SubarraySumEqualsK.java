package Hashing;

public class SubarraySumEqualsK {

     //   public static int subarraySum(int[] nums, int k) {
            //Time complexity : O(n2) Space complexity : O(1)O(1)
//        int count = 0;
//        int[] sum = new int[nums.length + 1];
//        sum[0] = 0;
//        for (int i = 1; i <= nums.length; i++)
//            sum[i] = sum[i - 1] + nums[i - 1];
//        for (int start = 0; start < nums.length; start++) {
//            for (int end = start + 1; end <= nums.length; end++) {
//                if (sum[end] - sum[start] == k)
//                    count++;
//            }
//        }
//        return count;
            //Time complexity : O(n) Space complexity : O(n).
//            int count = 0, sum = 0;
//            Map< Integer,Integer > map = new HashMap<>();
//            map.put(0, 1);
//            for (int i = 0; i < nums.length; i++) {
//                sum += nums[i];
//                if (map.containsKey(sum - k))
//                    count += map.get(sum - k);
//                map.put(sum, map.getOrDefault(sum, 0) + 1);
//            }
//            return count;
//        }
//    public static void main(String[] args) {
//        int nums[] = { 1, 2, 3, 4, 5,6};
//        int k=7;
//        System.out.print(subarraySum(nums,k));
//    }
}
