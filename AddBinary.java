package com.icbc.suanfa;

public class Solution {
    public String addBinary(String a,String b) {
    	int[] ca=new int[a.length()];
    	int[] cb=new int[b.length()];
    	
    	for(int i=0;i<a.length();i++){
    		ca[i]=a.charAt(i)-'0';
    	}
    	
    	for(int j=0;j<b.length();j++){
    		cb[j]=b.charAt(j)-'0';
    	}
    	
    	if(ca.length<cb.length){
    		int[] tmp=ca;
    		ca=cb;
    		cb=tmp;
    	}
    	
    	int ai=ca.length-1;
    	int bi=cb.length-1;
    	int carry=0;
    	int result=0;
    	while(ai>=0&&bi>=0){
    		result=ca[ai]+cb[bi]+carry;
    		ca[ai]=result%2;
    		carry=result/2;
    		ai--;
    		bi--;
    	}
    	
    	while(ai>=0){
    		result=ca[ai]+carry;
    		ca[ai]=result%2;
    		carry=result/2;
    		if(carry==0){
    			break;
    		}
    		ai--;
    	}
    	
    	for(int i=0;i<ca.length;i++){
    		ca[i]+='0';
    	}
        if (carry == 0) {

            char[] ch = new char[ca.length];
            for (int i = 0; i < ca.length; i++) {
                ch[i] = (char) (ca[i]);
            }

            return new String(ch);
        } 
        // 需要扩展一位
        else {
            char[] ch = new char[ca.length + 1];
            ch[0] = '1';
            for (int i = 0; i < ca.length; i++) {
                ch[i + 1] = (char) (ca[i]);
            }
            return new String(ch);
        }
    }

    public static void main(String[] args){
    	Solution s=new Solution();
    	String result=s.addBinary("0", "0");
    }
    
    
}



 
