package com.icbc.suanfa;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
	public boolean isIsomorphic(String s,String t){
		char[] c1=s.toCharArray();
		char[] c2=t.toCharArray();
		HashMap<Character,Character> map=new HashMap<Character,Character>();
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<c1.length;i++){
			if(!map.containsKey(c1[i])){
				if(set.contains(c2[i])){
					return false;
				}
				map.put(c1[i], c2[i]);
				set.add(c2[i]);
			}else{
				char temp=map.get(c1[i]);
				if(temp!=c2[i]){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		String s="ab";
		String t="aa";
		Solution solution=new Solution();
		boolean result=solution.isIsomorphic(s, t);
		System.out.println(result);
	}
}



 
