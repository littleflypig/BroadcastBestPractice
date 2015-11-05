package com.icbc.suanfa;

import java.util.HashSet;

public class Solution {
	HashSet<Integer> set=new HashSet<Integer>();
	public boolean isHappy(int n){
		if(set.contains(n)){
			return false;
		}else{
			set.add(n);
		}
		if(n<=0){
			return false;
		}
		if(n==1){
			return true;
		}
		while(n%10==0){
			n=n/10;
		}
		if(n==1){
			return true;
		}
		int sum=0;
		while(n>0){
			int t=n%10;
			sum+=Math.pow(t, 2);
			n=n/10;
		}
		return isHappy(sum);
	}
}



 