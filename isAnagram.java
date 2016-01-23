package com.icbc.suanfa;

import java.util.TreeMap;

public class Solution {
	public boolean isAnagram(String s,String t){
		TreeMap<Character,Integer> map1=new TreeMap<Character,Integer>();
		TreeMap<Character,Integer> map2=new TreeMap<Character,Integer>();
		char t1;
		Integer count1;
		for(int i=0;i<s.length();i++){
			t1=s.charAt(i);
			count1=map1.get(t1);
			if(count1==null){
				map1.put(t1, 1);
			}else{
				count1++;
				map1.put(t1,count1);
			}
		}

		char t2;
		Integer count2;
		for(int i=0;i<t.length();i++){
			t2=t.charAt(i);
			count2=map2.get(t2);
			if(count2==null){
				map2.put(t2, 1);
			}else{
				count2++;
				map2.put(t2,count2);
			}
		}
		
		if(map1.keySet().size()!=map2.keySet().size()){
			return false;
		}
		
		for(char key:map1.keySet()){
			int value1=map1.get(key);
			Integer value2=map2.get(key);
			if(value2==null){
			    return false;
			}
			if(value2!=null&&value2.intValue()!=value1){
				return false;
			}
		}
		return true;
	}
}



 