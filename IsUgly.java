package com.icbc.suanfa;

public class Solution {
	public boolean isUgly(int num){
		if(num<=0){//��������ugly
			return false;
		}
		if(num==1||num==2||num==3||num==5){//1��2��3��5�϶���ugly
			return true;
		}
		//ʹ������ѭ������2��3��5������ȥ�����ж���������
		while(num%2==0){
			num=num/2;
		}
		while(num%3==0){
			num=num/3;
		}
		while(num%5==0){
			num=num/5;
		}
		if(num==1){//������������1������ugly
			return true;
		}else{//���������Ӳ���1������ugly
			return false;
		}
	}
}



 