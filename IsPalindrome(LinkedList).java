package com.icbc.suanfa;

public class Solution {
	public boolean isPalindrome(ListNode head){
		if(head==null||head.next==null){
			return true;
		}
		//获取第二个链表的起始结点
		ListNode p=getSecondList(head);
		
		//反转第二个链表
		p=reverseList(p);
		
		//依次比较第一个链表和第二个链表的值
		while(head!=null&&p!=null){
			if(head.val!=p.val){
				return false;
			}
			head=head.next;
			p=p.next;
		}
		return true;
	}
	
	public ListNode getSecondList(ListNode head){
		ListNode p=head;
		while(p.next!=null&&p.next.next!=null){
			p=p.next.next;
			head=head.next;
		}
		p=head.next;//此时p为第二个链表的起始结点
		head.next=null;
		return p;
	}
	
	public ListNode reverseList(ListNode head){
		if(head==null||head.next==null){
			return head;
		}
		ListNode pre=head;
		ListNode current=head.next;
		ListNode nxt=null;
		pre.next=null;
		while(current!=null){
			nxt=current.next;
			current.next=pre;
			pre=current;
			current=nxt;
		}
		return pre;
	}
}



 
