package com.icbc.suanfa;

public class MinStack {
	Node node=null;
	public void push(int x){
		if(node==null){
			node=new Node(x);
			node.min=x;
		}else{
			Node temp=new Node(x);
			temp.next=node;
			node=temp;
			node.min=Math.min(node.next.min, x);
		}
	}
	
	public void pop(){
		node=node.next;
	}
	
	public int top(){
		return node==null?0:node.x;
	}
	
	public int getMin(){
		return node==null?0:node.min;
	}
}

class Node {
	int x;
	int min;
	Node next;
	public Node(int x){
		this.x=x;
	}
}
