package com.icbc.suanfa;

import java.util.Stack;

public class MyQueue {

	Stack<Integer> stack1=new Stack<Integer>();//进队
	Stack<Integer> stack2=new Stack<Integer>();//出队
	
	public void push(int x){
		stack1.push(x);
	}
	
	public void pop(){
		if(!stack2.isEmpty()){
			stack2.pop();
		}else{
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
			stack2.pop();	
		}
	}
	
	public int peek(){
		if(!stack2.isEmpty()){
			return stack2.peek();
		}else{
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
			return stack2.peek();	
		}
	}
	
	public boolean empty(){
		return stack1.isEmpty()&&stack2.isEmpty();
	}
}
