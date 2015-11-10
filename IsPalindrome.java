package com.icbc.suanfa;

public class Solution {
	public boolean isPalindrome(int x){
		if(x<0){
			return false;
		}
		if(x>=0&&x<=9){
			return true;
		}
		int len=1;
		while(x/len>=10){
			len=len*10;
		}
		while(x!=0){
			int left=x/len;
			int right=x%10;
			if(left!=right){
				return false;
			}
			x=(x%len)/10;
			len=len/100;
		}
		return true;
	}
	
	public static void main(String[] args){
		Solution solution=new Solution();
		Boolean result=solution.isPalindrome(1000021);
		System.out.println(result);
	}
}



 
