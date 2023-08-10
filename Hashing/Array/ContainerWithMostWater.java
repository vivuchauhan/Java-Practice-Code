package Array;

public class ContainerWithMostWater {
    // Two Pointers time: O(n) space: O(1)
    public static int maxArea_tp(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        //Calculating the max area
        int max = Math.min(height[left], height[right]) *
                (right - left);
        while (left < right) {
            // Move the shorter lines each time
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
            // update the max area ,Calculating the max area
            max = Math.max(max, Math.min(height[left],
                    height[right]) * (right - left));
        }
        return max;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int ans=maxArea_tp(height);
        System.out.print(ans);
    }
}
