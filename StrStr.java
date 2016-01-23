package com.icbc.suanfa;

public class Solution {
	public int strStr(String haystack,String needle){
		int index=haystack.indexOf(needle);
		return index;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.strStr("2324","32"));
	}
}
