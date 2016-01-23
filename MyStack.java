package com.icbc.suanfa;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

	public Queue<Integer> q=new LinkedList<Integer>();
	public void push(int x){
		q.offer(x);
	}
	
	public void pop(){
		int size=q.size();
		while(size>1){
			int val=q.poll();
			q.offer(val);
			size--;
		}
		q.poll();
	}
	
	public int top(){
		int size=q.size();
		while(size>1){
			int val=q.poll();
			q.offer(val);
			size--;
		}
		int x=q.poll();
		q.offer(x);
		return x;
	}
	
	public boolean empty(){
		return q.isEmpty();
	}
}
