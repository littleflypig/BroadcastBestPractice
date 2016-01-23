package com.icbc.suanfa;

public class Solution {
	public int romanToInt(String s){
		//��ǰ�����������,����ǰ����ǰһ����С,����sum���ϵ�ǰ��;��֮,������ϵ�ǰ��,����ȥǰһ����������ֵ.
		int sum=0;
		char[] array=s.toCharArray();
		for(int i=0;i<array.length;i++){
			//��Ե�һ���ַ������һ���ַ������
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



 