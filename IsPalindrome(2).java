package com.icbc.suanfa;

public class Solution {
	public boolean isPalindrome(String s){
		if(s==null||s.length()==0){
			return true;
		}
		String s1=s.toLowerCase();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)>='a'&&s1.charAt(i)<='z'||
					s1.charAt(i)>='0'&&s1.charAt(i)<='9'){
				sb.append(s1.charAt(i));
			}
		}
		String s0=sb.toString();
		String s2=sb.reverse().toString();
		if(s0.equals(s2)){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
	}
}
