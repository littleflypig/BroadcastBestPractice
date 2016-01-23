package com.icbc.suanfa;

public class Solution {
	public ListNode reverseList(ListNode head){//ตÝน้
		if(head==null||head.next==null){
			return head;
		}
		ListNode p=head.next;
		ListNode n=reverseList(p);
		
		head.next=null;
		p.next=head;
		return n;
	}
}



 