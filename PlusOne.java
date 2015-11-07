package com.icbc.suanfa;


public class Solution {
	public int[] plusOne(int[] digits){
		digits[digits.length-1]+=1;
		for(int i=digits.length-1;i>0;i--){
			if(digits[i]==10){
				digits[i]=0;
				digits[i-1]+=1;
			}
		}
		if(digits[0]==10){
			digits[0]=0;
			int digit0=1;
			int[] result=new int[digits.length+1];
			result[0]=digit0;
			for(int i=1;i<result.length;i++){
				result[i]=digits[i-1];
			}
			return result;
		}else{
			return digits;
		}
	}
	
	public static void main(String[] args){
		Solution solution=new Solution();
		int[] digits=new int[]{9,8,7,6,5,4,3,2,1,0};
		int[] digits1=solution.plusOne(digits);
		for(int i:digits1){
			System.out.print(i+" ");
		}
	}
}



 
