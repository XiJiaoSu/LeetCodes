package cn.wocding.leetcode.dp;

/**
 *问题描述：在爬楼梯是，每次只能向上走一个台阶或者两个台阶，问：有n阶的楼梯一共有多少种上楼的方式
 */
public class ClimbStairs {

    /**
     * 计算达到第n层楼梯一共有多少种走法
     * @param n 楼梯的层数
     * @return
     */
    public int climbStairs(int n) {
        int arrs[]=new int[n+1];
        if (n<=0){
            return -1;
        }
        if (n==1){
            return 1;
        }
        if (n==2) {
            return 2;
        }
        arrs[1]=1;
        arrs[2]=2;
        for (int i=3;i<=n;i++){
             arrs[i]=arrs[i-2]+arrs[i-1];
        }
        return arrs[n];
    }

     public static void main(String[] args) {
        ClimbStairs cb=new ClimbStairs();
        for (int i=1;i<10;i++){
            System.out.println(cb.climbStairs(i));
        }
    }

}
