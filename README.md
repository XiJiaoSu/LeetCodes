LeetCode Programming
==
#Dynamic Programming Codes

##ways of solving DP
    1)确认`原问题`与`子问题`
    2)确认状态
    3)确认`边界`状态的值
    4)确定`状态转移方程`
## Demos
[70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/description/):
You are climbing a stair case. It takes n steps to reach to the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Note: Given n will be a positive integer.<br>
思路:
    原问题求n阶台阶的所有的走法数量，子问题分解成求1,2,3......n-1阶的走法<br>
    状态为：第i阶台阶所有走法数量<br>
    边界： i=1，i=2时台阶的走法，num[1]=1,num[2]=2<br>
    状态转移方程:<br>
           第i阶时的值(走法)依赖于 i-1，i-2时的值，最终的方程式为:num[i]=num[i-1]+num[i-2]
           
[198. House Robber](https://leetcode.com/problems/house-robber/description/)       
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
<br>
  思路:
      原问题求n间房子的最优解，子问题分解成求第1,2,3......n-1阶的最优解<br>
      状态为：第i间房子的最优解<br>
      边界： i=1，i=2时最优解，res[1]=num[0],res[2]=max{num[0],num[1]}<br>
      状态转移方程:<br>
             第i 间房子的最优解依赖于 res[i-1]，res[i-2]+num[i]时的值，
             最终的方程式为:res[i]=max{num[i-1],num[i-2]+num[i]}
             
             
[53. Maximum Subarray](https://leetcode.com/problems/maximum-subarray/description/)
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
<br>
思路:<br>
   在House Robber 与ClimbStairs中我们使用的递推公式是：i 个状态依赖于第 `i-1` 或者 `i-2` 个状态。在本题中，由于第i个状态(子数组首元素-sub[0])不一定是原数组的首元素(arr[0])。
   但是 第i个状态一定是以arr[i]为结尾的。<br>
   
   问题变成: 以原数组arr中第i个元素结尾的每个子数组中的最大值
   <br>
   边界: result[0]=arr[0]
   <br>
   如果 result[i-1]>0, 那么:result[i]=result[i-1]+arr[i]
   否则:result[i]=arr[i]
    <br>
    递推公式: result[i]=max{result[i-1]+arr[i],num[i]}
