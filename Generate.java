package com.icbc.suanfa;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> list=new ArrayList<List<Integer>>();//list保存方法返回的二维列表
    	if(numRows==0){
        	List<List<Integer>> list0=new ArrayList<List<Integer>>();
    		return list0;
    	}
    	if(numRows==1){
            List<Integer> list0=new ArrayList<Integer>();
            list0.add(1);
            list.add(list0);
            return list;
    	}
    	
        List<Integer> list0=new ArrayList<Integer>();//list0保存每一行的一维列表
        list0.add(1);
        list.add(list0);
        ArrayList<Integer> list1=new ArrayList<Integer>(list0);
        while(numRows>1){
            ArrayList<Integer> list2=new ArrayList<Integer>();
            list1.add(list1.size(), 0);
            list1.add(0, 0);
            for(int i=0;i<list1.size()-1;i++){
            	int value=list1.get(i)+list1.get(i+1);
            	list2.add(value);
            }
            list.add(new ArrayList<Integer>(list2));
            list1=list2;
            numRows--;
        }
        return list;
    }
}



 
