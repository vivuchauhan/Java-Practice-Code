package Array;

public class ContainerMostWater {
    // Two Pointers time: O(n^2) space: O(1)
    public static int maxArea(int[] a){
        int Area = 0;
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
               // Calculating the max area
                Area = Math.max(Area,Math.min(a[i], a[j]) * (j - i));
            }
        }
        return Area;
    }
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        int ans=maxArea(a);
        System.out.print(ans);
    }
}
