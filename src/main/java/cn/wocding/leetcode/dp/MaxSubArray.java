package cn.wocding.leetcode.dp;

/**
 * 给定一个数组，求这个数组的连续子数组中，最大的那一段的和
 */
public class MaxSubArray {


    public int maxSubArray(int[] nums) {

        if (nums==null||nums.length<0){
            return 0;
        }
        int result[]=new int[nums.length];
        result[0]=nums[0];
        int max_value=result[0];
        for (int i=1;i<nums.length;i++){
            result[i]=Math.max(result[i-1]+nums[i],nums[i]);//递推公式: 上一个状态最大值是正数，就是result[i-1]+num[i]，否则 num[i]
            if (max_value<result[i]){
                max_value=result[i];
            }
        }
        return max_value;
    }




     public static void main(String[] args) {
         MaxSubArray maxSubArray = new MaxSubArray();
         int[] nums={-2,1,-3,4,-1,2,1,-5,4};
         System.out.println(maxSubArray.maxSubArray(nums));
     }
}
