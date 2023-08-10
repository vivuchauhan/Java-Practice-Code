package Array;
import java.util.*;
public class Three_sum {
    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0, j = 0, n = nums.length, k = n - 1;
        if (k < 2 || nums[k] < 0) {
            return res;
        }
        while (i < n - 2) {
            if (nums[i] > 0) {
                break;
            }
            int target = -nums[i];
            j = i + 1;
            k = n - 1;
            while (j < k) {
                if (nums[k] < 0) {
                    break;
                }
                if (nums[j] + nums[k] == target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j < k && nums[j] == nums[++j]);
                    while(j < k && nums[k] == nums[--k]);
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;
                }}
            while (i < n - 2 && nums[i] == nums[++i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[]nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum1(nums));
    }
//    public static List<List<Integer>> threeSum2(int[] nums) {
//        Arrays.sort(nums);
//        Set<List<Integer>> threeSum = new HashSet<>();
//        for(int i = 0; i < nums.length - 2; i++){
//            int j = i + 1;
//            int k = nums.length - 1;
//            while(j < k){
//                int sum = nums[i] + nums[j] + nums[k];
//                if(sum == 0){
//                    List<Integer> temp = new ArrayList<>();
//                    temp.add(nums[i]);
//                    temp.add(nums[j]);
//                    temp.add(nums[k]);
//                    threeSum.add(temp);
//                    j++;
//                    k--;
//                }else if(sum > 0){
//                    k--;
//                }else{
//                    j++;
//                }
//            }
//        }
//        return new ArrayList<>(threeSum);
//    }
}
