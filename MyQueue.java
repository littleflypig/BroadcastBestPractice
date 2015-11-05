package com.icbc.suanfa;

import java.util.Stack;

public class MyQueue {

	Stack<Integer> stack1=new Stack<Integer>();
	Stack<Integer> stack2=new Stack<Integer>();
	
	public void push(int x){
		stack1.push(x);
	}
	
	public void pop(){
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		stack2.pop();
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
	}
	
	public int peek(){
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		int t=stack2.peek();
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
		return t;
	}
	
	public boolean empty(){
		return stack1.isEmpty();
	}
}
