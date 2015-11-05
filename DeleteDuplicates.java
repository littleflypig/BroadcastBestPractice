package com.icbc.suanfa;

public class Solution {
	public ListNode deleteDuplicates(ListNode head){//±éÀú
		if(head==null||head.next==null){
			return head;
		}

		ListNode pre=head;
		ListNode p=head.next;
		ListNode next;
		while(p!=null){
			next=p.next;
			if(pre.val==p.val){
				pre.next=next;
				p=next;
			}else{
				pre=p;
				p=next;
			}
		}
		return head;
	}
}



 