package com.icbc.suanfa;

public class Solution {
	public String countAndSay(int n){
		int count=n-1;
		String result=String.valueOf(1);
		while(count>0){
			result=getNthResult(result);
			count--;
		}
		return result;
	}
	
	public String getNthResult(String s){
		StringBuilder sb=new StringBuilder();
		char[] array=s.toCharArray();
		int count=1;
		if(array.length==1){
			sb.append(String.valueOf(count));
			sb.append(String.valueOf(array[0]));
		}
		for(int i=0;i<=array.length-2;i++){
			if(array[i]==array[i+1]){
				count++;
			}else{
				sb.append(String.valueOf(count));
				sb.append(String.valueOf(array[i]));
				count=1;
			}
			if(i==array.length-2){
				sb.append(String.valueOf(count));
				sb.append(String.valueOf(array[i+1]));
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		int n=4;
		Solution solution=new Solution();
		String result=solution.countAndSay(n);
		System.out.println(result);
	}
}



 
