package com.icbc.suanfa;

/**
 * 动态规划原理：
 * 用max[i]来记录当Robber到达第i个房屋时，他在该房屋可能的最大收益。
 * 比较max[i-2]+nums[i]与max[i-1]的值，取较大的值所代表的方式。
 * 如果max[i-2]+nums[i]值大，表示Robber要采取抢劫第i-2个房屋和第i个房屋。
 * 如果max[i-1]值较大，表示Robber要采取抢劫第i-1个房屋的方式，且跳过第i个房屋，避免触发警报。
 * */

public class Solution {
	public int rob(int[] nums){
		if(nums==null||nums.length==0){
			return 0;
		}
		if(nums.length==1){
			return nums[0];
		}
		if(nums.length==2){
			return Math.max(nums[0], nums[1]);
		}
		int[] max=new int[nums.length];
		max[0]=nums[0];
		max[1]=Math.max(nums[0], nums[1]);
		for(int i=2;i<nums.length;i++){
			max[i]=Math.max(max[i-1], max[i-2]+nums[i]);
		}
		int result=max[0];
		for(int i=1;i<max.length;i++){
			if(max[i]>=result){
				result=max[i];
			}
		}
		return result;
	}
}



 
