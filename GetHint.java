package com.icbc.suanfa;

import java.util.ArrayList;

public class Solution {
	public String getHint(String secret,String guess){
		char[] l1=secret.toCharArray();
		char[] l2=guess.toCharArray();
		
		ArrayList<Character> array1=new ArrayList<Character>();
		ArrayList<Character> array2=new ArrayList<Character>();
		int bulls=0;
		int cows=0;
		for(int i=0;i<l1.length;i++){
			if(l1[i]==l2[i]){
				bulls++;
			}else{
				array1.add(l1[i]);
				array2.add(l2[i]);
			}
		}
		
		for(Character c:array2){
			int index=array1.indexOf(c);
			if(index==-1){
				continue;
			}
			cows++;
			array1.remove(index);
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
		String result=s.getHint("1122", "1222");
		System.out.println(result);
	}
}



 
