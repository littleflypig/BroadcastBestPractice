package com.icbc.suanfa;

import java.util.Stack;

public class Solution {//�������������⣬����Ҫ�󷵻��³��Ⱦ����ˣ�����û˵����ԭ����Ҫ��ô����
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



 