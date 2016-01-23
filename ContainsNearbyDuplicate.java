package com.icbc.suanfa;

import java.util.HashMap;

/**
 * ���һ������Ϊn�Ļ�������
 * */
public class Solution {
	public boolean containsNearbyDuplicate(int[] nums,int k){
		if(nums==null||nums.length<2){
			return false;
		}
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				int index=map.get(nums[i]);//nums[i]��ʱ��map��ӳ���ֵ
				if(i-index<=k){
					return true;
				}else{
					map.remove(nums[i]);
					map.put(nums[i], i);
				}
			}else{
				map.put(nums[i], i);
			}
		}
		return false;
	}
}



 
