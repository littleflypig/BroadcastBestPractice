package com.icbc.suanfa;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
	public boolean wordPattern(String pattern,String str){
		if(pattern.equals(str)){
			return false;
		}
		char[] array1=pattern.toCharArray();
		String[] array2=str.split(" ");
		HashMap<Character,String> map=new HashMap<Character,String>();
		HashSet<String> set=new HashSet<String>();
		if(array1.length!=array2.length){
			return false;
		}
		for(int i=0;i<array1.length;i++){
			if(map.containsKey(array1[i])){
				String s=map.get(array1[i]);
				if(!s.equals(array2[i])){
					return false;
				}
			}else{
				if(set.contains(array2[i])){
					return false;
				}
				map.put(array1[i], array2[i]);
				set.add(array2[i]);
			}
		}
		return true;
	}
}



 
