package Array;

public class SumOfTwoIndex {
    public static void main(String[] args) {
        //2 Sum problem
        int arr[]={4,0,1,2,5,3,6}; //[1,3]
        int ans[]= new int[2];
        int target=6;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+",");
        }
    }
    //TwoSum
//    public int[] twoSum(int[] nums, int target) {
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[j]==target-nums[i]){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return null;
//    }
}
