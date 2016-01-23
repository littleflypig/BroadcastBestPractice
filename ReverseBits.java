package com.icbc.suanfa;

public class Solution {
	public int reverseBits(int n){
		int reverse=0;
		for(int i=0;i<31;i++){
			reverse=(n&1)|reverse;
			reverse=reverse<<1;
			n=n>>1;
		}
		reverse=(n&1)|reverse;
		return reverse;
	}
}



 
