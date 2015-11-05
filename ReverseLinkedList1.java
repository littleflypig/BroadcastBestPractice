package com.icbc.suanfa;

public class Solution {
	public ListNode reverseList(ListNode head){//±éÀú
		if(head==null||head.next==null){
			return head;
		}
		ListNode pre=head;
		ListNode p=head.next;
		pre.next=null;
		ListNode next=null;
		while(p!=null){
			next=p.next;
			p.next=pre;
			pre=p;
			p=next;
		}
		return pre;
	}
}



 