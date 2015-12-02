package com.icbc.suanfa;

public class Solution {
	public void rotate(int[] nums,int k){
		if(nums==null||k<0){
			return;
		}
		k=k%nums.length;
		int length=nums.length;
		reverse(nums,0,length-k-1);
		reverse(nums,length-k,length-1);
		reverse(nums,0,length-1);
		
	}
	
	public void reverse(int[] nums,int left,int right){
		if(nums==null){
			return;
		}
		int i=left;
		int j=right;
		while(i<j){
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			i++;
			j--;
		}
	}
	
	public static void main(String[] args){
		Solution solution=new Solution();
		int[] nums={1,2,3,4,5,6,7};
		solution.rotate(nums, 3);
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
	}
}
