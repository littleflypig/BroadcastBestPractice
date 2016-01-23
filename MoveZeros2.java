package com.icbc.suanfa;

/*
 * 思路：遍历数组，并将非零元素依从前往后顺序赋给原数组。最后用零元素填充剩余的位置。
 * 
 * */
public class Solution {
	public void moveZeroes(int[] nums){
		int zerocount=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=0)
			nums[zerocount++]=nums[i];
		}
		for(;zerocount<nums.length;zerocount++){
			nums[zerocount]=0;
		}
	}
}
