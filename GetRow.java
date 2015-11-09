package com.icbc.suanfa;

import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<Integer> getRow(int rowIndex){
		Integer[] list=new Integer[rowIndex+1];//获得rowIndex+1个初始值为0的 元素
		for(int i=0;i<list.length;i++){
			list[i]=0;
		}
		if(rowIndex==0){
			list[0]=1;
			return Arrays.asList(Arrays.copyOfRange(list,0,rowIndex+1));
		}
		list[0]=1;
		int temp=rowIndex;
		while(temp>0){
			for(int i=list.length-1;i>0;i--){
				list[i]=list[i-1]+list[i];
			}
			temp--;
		}
		return Arrays.asList(Arrays.copyOfRange(list,0,rowIndex+1));
	}
	
	public static void main(String[] args){
		Solution solution=new Solution();
		List<Integer> list=solution.getRow(2);
		for(Integer i:list){
			System.out.println(i);
		}
	}
}



 
