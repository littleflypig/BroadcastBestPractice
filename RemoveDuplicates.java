package com.icbc.suanfa;

public class Solution {
	public int removeDuplicates(int[] nums){
		if(nums==null){
			return 0;
		}
		if(nums.length==1){
			return 1;
		}
		int count=0;//记录数值不同的个数
		for(int i=0;i<=nums.length-2;i++){
			if(nums[i]!=nums[i+1]){
				count++;
				nums[count]=nums[i+1];
			}
		}
		return count+1;
	}
}



 
