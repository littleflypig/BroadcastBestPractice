package com.icbc.suanfa;

import java.util.HashMap;

/**
 * 设计一个长度为n的滑动窗口
 * */
public class Solution {
	public boolean containsNearbyDuplicate(int[] nums,int k){
		if(nums==null||nums.length<2){
			return false;
		}
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				int index=map.get(nums[i]);//nums[i]此时在map中映射的值
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



 
