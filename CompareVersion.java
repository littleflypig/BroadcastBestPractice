package com.icbc.suanfa;

public class Solution {
	public int compareVersion(String version1,String version2){
		String[] v1=version1.split("\\.");
		String[] v2=version2.split("\\.");
		int i=0;
		int n1=v1.length;
		int n2=v2.length;
		while(i<n1||i<n2){
			int x1=i<n1?Integer.parseInt(v1[i]):0;
			int x2=i<n2?Integer.parseInt(v2[i]):0;
			if(x1>x2){
				return 1;
			}else if(x1<x2){
				return -1;
			}else{
				i++;
			}
		}
		return 0;
	}
	
	public static void main(String[] args){
		Solution solution=new Solution();
		int[] nums={1,2,3,4,5,6,7};
		System.out.println(solution.compareVersion("1","1.1"));
//		System.out.println("1.0.1".replaceAll("\\.[0]", ""));
	}
}
