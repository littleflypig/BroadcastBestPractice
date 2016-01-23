package com.icbc.suanfa;

public class Solution {
	public ListNode mergeTwoLists(ListNode l1,ListNode l2){
		ListNode p1=l1;
		ListNode p2=l2;
		if(l1==null){
			return l2;
		}
		if(l2==null){
			return l1;
		}
		
		ListNode p0=new ListNode(0);
		ListNode p=p0;
		while(p1!=null&&p2!=null){
			if(p1.val<=p2.val){
				p.next=p1;
				p1=p1.next;
			}else{
				p.next=p2;
				p2=p2.next;
			}
			p=p.next;
		}
		if(p1!=null){
			p.next=p1;
		}
		if(p2!=null){
			p.next=p2;
		}
		return p0.next;
	}
}



 