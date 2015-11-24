package com.icbc.suanfa;

import java.util.ArrayList;
import java.util.List;

//核心思想，定位fist和last
//当first==last时，添加fist;否则添加first->last;
public class Solution {
	public List<String> summaryRanges(int[] nums){
		List<String> list=new ArrayList<String>();
		if(nums==null||nums.length==0){
			return list;
		}
		if(nums.length==1){
			list.add(String.valueOf(nums[0]));
			return list;
		}
		String first=String.valueOf(nums[0]);
		String last="";
		for(int i=0;i<nums.length-1;i++){
			last=String.valueOf(nums[i]);
			if(nums[i]+1!=nums[i+1]){
				String s="";
				if(first.equals(last)){
					s=first;
				}else{
					s=first+"->"+last;
				}
				list.add(s);
				first=String.valueOf(nums[i+1]);
				last=String.valueOf(nums[i+1]);
			}
		}
		last=String.valueOf(nums[nums.length-1]);
		String s="";
		if(first.equals(last)){
			s=first;
		}else{
			s=first+"->"+last;
		}
		list.add(s);
		
		return list;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums={1,3};
		System.out.println(solution.summaryRanges(nums));
	}
}
