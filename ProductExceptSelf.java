package com.icbc.suanfa;

public class Solution {
	public int[] productExceptSelf(int[] nums){
		int result = 1;
		int zeroCount = 0;
		int flag=-1;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==0){
				flag=i;
				zeroCount++;
			}
			result*=nums[i];
		}
		int[] outPut=new int[nums.length];
		if(zeroCount>=2){
			return outPut;
		}
		if(flag>=0){
			int temp=1;
			for(int i=0;i<nums.length;i++){
				if(i==flag){
					continue;
				}
				temp*=nums[i];
			}
			outPut[flag]=temp;
			return outPut;
		}else{
			for(int i=0;i<nums.length;i++){
				outPut[i]=result/nums[i];
			}
			return outPut;
		}
	}
}
