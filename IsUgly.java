package com.icbc.suanfa;

public class Solution {
	public boolean isUgly(int num){
		if(num<=0){//负数不是ugly
			return false;
		}
		if(num==1||num==2||num==3||num==5){//1、2、3、5肯定是ugly
			return true;
		}
		//使用三个循环，将2、3、5的因子去掉，判断最后的因子
		while(num%2==0){
			num=num/2;
		}
		while(num%3==0){
			num=num/3;
		}
		while(num%5==0){
			num=num/5;
		}
		if(num==1){//若最后的因子是1，则是ugly
			return true;
		}else{//若最后的因子不是1，则不是ugly
			return false;
		}
	}
}



 