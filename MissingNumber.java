package com.icbc.suanfa;

public class Solution {
    public int missingNumber(int[] nums) {
    	int flag=0;
    	int max=0;
    	int sum0=0;//real
    	int sum1=0;//perfect
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]==0){
    			flag=1;
    		}
    		if(nums[i]>max){
    			max=nums[i];
    		}
    		sum0+=nums[i];
    	}
    	if(flag==0){//若不包含0，则返回0
    		return 0;
    	}else{//若包含0
    		sum1=(1+max)*max/2;
    		int diff=sum1-sum0;
    		if(diff==0){
    			return (max+1);
    		}else{
    			return diff;
    		}
    	}
    }
    public static void main(String[] args) {
		Solution solution=new Solution();
		int[] nums={0,1,2};
		System.out.println(solution.missingNumber(nums));
	}
}
