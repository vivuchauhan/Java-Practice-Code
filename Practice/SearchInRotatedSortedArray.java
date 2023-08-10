package Practice;

public class SearchInRotatedSortedArray {
    public static boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return true;
            else if (nums[mid] > nums[start]) {
                if (target >= nums[start] && target < nums[mid]) end = mid - 1;
                else start = mid + 1;
            }
            else if (nums[mid] < nums[start]){
                if (target <= nums[end] && target > nums[mid]) start = mid + 1;
                else end = mid - 1;
            } else {
                start += 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
       int[] nums = {2,5,6,0,0,1,2};
        //search(nums,0);
        System.out.println(search(nums,3));
    }
}
