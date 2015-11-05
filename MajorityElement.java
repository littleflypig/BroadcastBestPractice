package com.icbc.suanfa;

import java.util.Arrays;

public class Solution {
	public int majorityElement(int[] nums){
		Arrays.sort(nums);
		int count=1;
		int target=nums[0];
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]==nums[i+1]&&i!=nums.length-2){
				count++;
			}else{
				if(nums[i]==nums[i+1]&&i==nums.length-2){
					count++;
					target=nums[i];
					break;
				}
				if(count>(nums.length/2)){
					target=nums[i];
					break;
				}else{
					count=1;
				}
			}
		}
		return target;
	}
}



 