package com.icbc.suanfa;

/**
 * 设计一个长度为n的滑动窗口
 * */
public class Solution {
	public ListNode removeNthFromEnd(ListNode head,int n){
		if(head==null){
			return null;
		}
		ListNode p=head;//p结点保存窗口的最右边
		ListNode q=head;///q结点保存窗口的最左边
		ListNode t=new ListNode(head.val);//t结点保存q的左邻边结点
		t.next=head;
		for(int i=1;i<=n-1;i++){
			p=p.next;
			if(p==null){
				return null;
			}
		}
		while(p.next!=null){
			p=p.next;
			q=q.next;
			t=t.next;
		}
		t.next=q.next;
		if(head==q){
			return t.next;
		}
		return head;
	}
}



 
