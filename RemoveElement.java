package com.icbc.suanfa;

import java.util.Stack;

public class Solution {//这道题好像有问题，明明要求返回新长度就行了，根本没说对于原数组要怎么处理。
	public int removeElement(int[] nums,int val){
		int count=0;
		for(int i=0;i<nums.length;i++){
			if(val!=nums[i]){
				nums[count]=nums[i];
				count++;
			}
		}
		return count;
	}
}



 