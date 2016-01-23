package com.icbc.suanfa;

public class Solution {
	public ListNode removeElements(ListNode head,int val){
		if(head==null){
			return null;
		}
		while(head!=null&&head.val==val){
			head=head.next;
		}
		if(head==null){
			return null;
		}
		ListNode flag=new ListNode(0);
		flag.next=head;
		ListNode p=head.next;
		while(p!=null){
			if(p.val==val){
				head.next=p.next;
			}else{
				head=p;
			}
			p=p.next;
		}
		head=flag.next;
		return head;
	}
}



 
