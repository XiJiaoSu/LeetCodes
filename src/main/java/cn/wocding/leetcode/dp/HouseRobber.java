package cn.wocding.leetcode.dp;

public class HouseRobber {

    public int rob(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        //计算第i间房子的最优解为 results[i]
        int results[]=new int[nums.length];
        results[0]=nums[0];
        results[1]=Math.max(nums[0],nums[1]);
        for (int i=2;i<nums.length;i++){
            results[i]=Math.max(results[i-1],results[i-2]+nums[i]);
        }
        return results[nums.length-1];
    }


    public static void main(String[] args) {
        int arrs[]={5,2,6,3,1,7};
        HouseRobber houseRobber = new HouseRobber();
        System.out.println(houseRobber.rob(arrs));
    }
}
