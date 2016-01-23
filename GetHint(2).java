package com.icbc.suanfa;

import java.util.ArrayList;

public class Solution {
	public String getHint(String secret,String guess){

		int bulls=0;
		int cows=0;
		int[] list=new int[10];
		
		for(int i=0;i<secret.length();i++){
			list[secret.charAt(i)-'0']++;
		}
		
		for(int i=0;i<secret.length();i++){
			if(secret.charAt(i)==guess.charAt(i)){
				bulls++;
				list[secret.charAt(i)-'0']--;
			}
		}
		
		for(int i=0;i<secret.length();i++){
			if((secret.charAt(i)!=guess.charAt(i))&&list[guess.charAt(i)-'0']>0){
				cows++;
				list[guess.charAt(i)-'0']--;
			}
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append(String.valueOf(bulls));
		sb.append("A");
		sb.append(String.valueOf(cows));
		sb.append("B");
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Solution s=new Solution();
		String result=s.getHint("1234", "0111");
		System.out.println(result);
	}
}



 
