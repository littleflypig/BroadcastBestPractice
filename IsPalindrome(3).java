package com.icbc.suanfa;

public class Solution {
	public boolean isPalindrome(String s){
		if(s==null||s.length()==0||s.length()==1){
			return true;
		}
		String s1=s.toLowerCase();
		int i=0;
		int j=s1.length()-1;

		while(i<j){
			while(!isAlphaNumeric(s1.charAt(i))){
				i++;
				if(i>=j){
					return true;
				}
			}
			while(!isAlphaNumeric(s1.charAt(j))){
				j--;
				if(i>=j){
					return true;
				}
			}
			if(s1.charAt(i)!=s1.charAt(j)){
				return false;
			}else{
				i++;
				j--;
			}
			
		}
		return true;
	}
	
	public boolean isAlphaNumeric(Character c){
		if(c>='0'&&c<='9'||c>='a'&&c<='z'){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.isPalindrome(".,"));
	}
}
