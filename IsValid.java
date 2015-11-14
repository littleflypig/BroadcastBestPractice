package com.icbc.suanfa;

import java.util.ArrayList;

public class Solution {
	public boolean isValid(String s){
		ArrayList<Character> array=new ArrayList<Character>();
		for(Character c:s.toCharArray()){
			if(c=='('||c=='{'||c=='['){
				array.add(c);
			}else if(!array.isEmpty()){
				char temp=array.get(array.size()-1);
				if(c==')'&&temp=='('||c=='}'&&temp=='{'||c==']'&&temp=='['){
					array.remove(array.size()-1);
				}else{
					return false;
				}
			}else{
				return false;
			}
		}
		if(!array.isEmpty()){
			return false;
		}
		return true;
	}
}



 
