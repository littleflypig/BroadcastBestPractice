package com.icbc.suanfa;

/**
 * ��̬�滮ԭ��
 * ��max[i]����¼��Robber�����i������ʱ�����ڸ÷��ݿ��ܵ�������档
 * �Ƚ�max[i-2]+nums[i]��max[i-1]��ֵ��ȡ�ϴ��ֵ������ķ�ʽ��
 * ���max[i-2]+nums[i]ֵ�󣬱�ʾRobberҪ��ȡ���ٵ�i-2�����ݺ͵�i�����ݡ�
 * ���max[i-1]ֵ�ϴ󣬱�ʾRobberҪ��ȡ���ٵ�i-1�����ݵķ�ʽ����������i�����ݣ����ⴥ��������
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



 
