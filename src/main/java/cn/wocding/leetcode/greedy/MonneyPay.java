package cn.wocding.leetcode.greedy;

import java.util.Scanner;

/**
 * 贪婪最基本的问题：钞票支付最少张数问题
 */
public class MonneyPay {


     public static void main(String[] args) {
        int MONEY[]={200,100,20,10,5,1};
        int num=MONEY.length;
         Scanner scanner = new Scanner(System.in);
         int X = scanner.nextInt();
         int count=0;
         for (int i=0;i<num;i++){
             int use=X/MONEY[i];
             count+=use;
             X%=MONEY[i];
             System.out.println("面额 "+MONEY[i] +" 需要 "+use +" 张");
         }
         System.out.println("一共需要 "+count+" 张");
     }

}
