package com.icbc.suanfa;

public class Solution {
	public int climbStairs(int n){
		if(n==2||n==1){
			return n;
		}
		//return climbStairs(n-1)+climbStairs(n-2);
		int t1=1;//һ��̨��ʱ�߷�
		int t2=2;//����̨��ʱ�߷�
		int t3=3;//����̨��ʱ�߷�
		for(int i=3;i<=n;i++){
			t3=t1+t2;
			t1=t2;
			t2=t3;
		}
		return t3;
	}
}



 