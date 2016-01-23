package com.icbc.suanfa;

public class Solution {
	public String convert(String s,int numRows){
		if(numRows==1){
			return s;
		}
		StringBuilder sb=new StringBuilder();
		//��һ��
		for(int i=0;i<s.length();i+=numRows*2-2){
			sb.append(s.charAt(i));
		}
		
		//�м�������
		for(int i=1;i<numRows-1;i++){
			for(int j=i;j<s.length();j+=numRows*2-2){
				sb.append(s.charAt(j));
				if(j+(numRows-i-1)*2<s.length()){
					sb.append(s.charAt(j+(numRows-i-1)*2));
				}
			}
		}
		
		//���һ��
		for(int i=numRows-1;i<s.length();i+=numRows*2-2){
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.convert("PAYPALISHIRING", 3));
	}
}
