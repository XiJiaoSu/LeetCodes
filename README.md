LeetCode Programming
==
#一、Dynamic Programming Codes

##1、ways of solving DP
    1)确认`原问题`与`子问题`
    2)确认状态
    3)确认`边界`状态的值
    4)确定`状态转移方程`
## 2、Demos
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
           

