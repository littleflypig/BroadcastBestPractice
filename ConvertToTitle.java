package com.icbc.suanfa;

public class Solution {
	public String convertToTitle(int n){
		String s="";
		int sum=n;
		while(sum>0){
			int temp1=sum/26;
			if(temp1*26==sum){
				s='Z'+s;
				sum=sum-26;
			}else{
				int temp2=sum-temp1*26;
				char c=(char)('A'+temp2-1);
				s=String.valueOf(c)+s;
			}
			sum=sum/26;
		}
		return s;
	}
	
	public static void main(String[] args){
		Solution solution=new Solution();
		System.out.println(solution.convertToTitle(52));
	}
}
