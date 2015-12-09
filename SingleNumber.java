package com.icbc.suanfa;

public class Solution {
	public int singleNumber(int[] nums){
		int result=0;
		for(int i=0;i<nums.length;i++){
			result^=nums[i];
		}
		return result;
	}
	
	public static void main(String[] args){
		Solution solution=new Solution();
		int[] nums={1,1,2,2,3,3,7};
		System.out.println(solution.singleNumber(nums));
	}
}
