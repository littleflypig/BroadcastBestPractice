package com.icbc.suanfa;

/**
 * 设计一个长度为n的滑动窗口
 * */
public class Solution {
	public int computeArea(int A,int B,int C,int D,int E,int F,int G,int H){
		int cos=0;
		if(C<=E||A>=G||B>=H||D<=F){
			cos=0;
		}else{
			cos= Math.abs(Math.min(C, G)-Math.max(A, E))*Math.abs(Math.min(H, D)-Math.max(B, F));
		}
		int area1=Math.abs(A-C)*Math.abs(B-D);
		int area2=Math.abs(E-G)*Math.abs(H-F);
		return area1+area2-cos;
	}
}



 
