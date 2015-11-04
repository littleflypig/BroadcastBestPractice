package com.icbc.suanfa;

public class Solution {
	public void moveZeroes(int[] nums){
		int zerocount=0;
		for(int i=nums.length-1;i>=0;i--){
			if(i==nums.length-1&&nums[i]==0){
				zerocount++;
				continue;
			}
			if(nums[i]==0){
				for(int j=i;j<nums.length-zerocount-1;j++){
					int temp=nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
				}
				zerocount++;
			}
		}
	}
}
