package com.icbc.suanfa;

import java.util.Arrays;

public class Solution {
	public boolean isAnagram(String s,String t){
		char[] array1=s.toCharArray();
		char[] array2=t.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		return String.valueOf(array1).equals(String.valueOf(array2));
				
	}
}



 