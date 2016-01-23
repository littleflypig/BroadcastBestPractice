package com.icbc.suanfa;

import java.util.Stack;
import java.util.TreeMap;

public class MinStack {
	Stack<Integer> stack=new Stack<Integer>();
	TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
	public void push(int x){
		stack.push(x);
		Integer value=map.get(x);
		if(value==null){
			map.put(x, 1);
		}else{
			value+=1;
			map.put(x,value);
		}
	}
	
	public void pop(){
		int x=stack.pop();
		int count=map.get(x);
		count--;
		if(count==0){
			map.remove(x);
		}else{
			map.put(x, count);
		}
	}
	
	public int top(){
		return stack.peek();
	}
	
	public int getMin(){
		return map.firstKey();
	}
}
