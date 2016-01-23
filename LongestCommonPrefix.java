package com.icbc.suanfa;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
    	if(strs==null||strs.length==0){
    		return "";
    	}
    	if(strs.length==1){
    		return strs[0];
    	}
    	String temp=strs[0];
    	for(int i=1;i<=strs.length-1;i++){
    		temp=prefix(temp,strs[i]);
    		if("".equals(temp)){
    			return "";
    		}
    	}
    	return temp;
    }
    
    public String prefix(String s1,String s2){
    	int n=Math.min(s1.length(), s2.length());
    	if(n==0){
    		return "";
    	}
    	StringBuilder sb=new StringBuilder();
    	for(int i=0;i<n;i++){
    		if(s1.charAt(i)!=s2.charAt(i)){
    			break;
    		}else{
    			sb.append(s1.charAt(i));
    		}
    	}
    	return sb.toString();
    }
}



 
