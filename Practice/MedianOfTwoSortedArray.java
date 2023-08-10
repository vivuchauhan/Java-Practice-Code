package Practice;
public class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s1=nums1.length, s2=nums2.length;
        double[] temp=new double[s1+s2];
        int i=0,j=0,k=0;
        while(i<s1 && j<s2){
            if(nums1[i] <= nums2[j]){
                temp[k]=nums1[i];
                i++;
                k++;
            }else{
                temp[k]=nums2[j];
                j++;
                k++;}}
        if(i>=s1){
            for(int t=j;t<s2;t++){
                temp[k]=nums2[t];
                k++;}}
        if(j>=s2){
            for(int t=i;t<s1;t++){
                temp[k]=nums1[t];
                k++;}}
        double ans=0.0;
        if(temp.length%2!=0)
            return temp[temp.length/2];
        else
            return (temp[temp.length/2]+temp[temp.length/2-1])/2;}
    public static void main(String[] args) {
        int [] nums1 = {1,2}, nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
