package Array;
import java.util.*;
public class Two_sum {
    public  int[] twoSum(int[] nums, int target) {
        //Brute Force O(n2)
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) {
//                    return new int[] { i, j };
//                }
//            }
//        }
//        // In case there is no solution, we'll just return null
//        return null;

        //One-pass Hash Table O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
