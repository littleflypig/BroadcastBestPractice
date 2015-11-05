package com.icbc.suanfa;

public class Solution {
	public int romanToInt(String s){
		//从前往后遍历数据,若当前数比前一个数小,则结果sum加上当前数;反之,结果加上当前数,并减去前一个数的两倍值.
		int sum=0;
		char[] array=s.toCharArray();
		for(int i=0;i<array.length;i++){
			//针对第一个字符和最后一个字符的情况
			if(i==0){
				sum+=value(array[i]);
				continue;
			}
			if(value(array[i])>value(array[i-1])){
				sum+=value(array[i]);
				sum-=value(array[i-1])*2;
			}else{
				sum+=value(array[i]);
			}
		}
		return sum;
	}
	
	public int value(char c){
		switch(c){
		case 'I':return 1;
		case 'X':return 10;
		case 'C':return 100;
		case 'M':return 1000;
		case 'V':return 5;
		case 'L':return 50;
		case 'D':return 500;
		default:return 1;
		}
	}
}



 