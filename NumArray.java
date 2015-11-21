package com.icbc.suanfa;

public class NumArray {

	private int[] sums;
    public NumArray(int[] nums) {
        if(nums==null){
        	this.sums=null;
        }else{
        	if(nums.length==0){
        		this.sums=new int[0];
        	}else{
        		this.sums=new int[nums.length];
        		int sum=0;
        		for(int i=0;i<nums.length;i++){
        			sum+=nums[i];
        			sums[i]=sum;
        		}
        	}
        }
    }

    public int sumRange(int i, int j) {
    	if(sums==null||sums.length==0){
    		return 0;
    	}else{
    		if(i>=sums.length||j>=sums.length||i>j){
    			return 0;
    		}
    		if(i==0){
    			return sums[j];
    		}else{
    			return sums[j]-sums[i-1];
    		}
    	}
    }
}



 
