package com.icbc.suanfa;

/*
 * ˼·���������飬��������Ԫ������ǰ����˳�򸳸�ԭ���顣�������Ԫ�����ʣ���λ�á�
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
