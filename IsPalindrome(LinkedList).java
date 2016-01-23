package com.icbc.suanfa;

public class Solution {
	public boolean isPalindrome(ListNode head){
		if(head==null||head.next==null){
			return true;
		}
		//��ȡ�ڶ����������ʼ���
		ListNode p=getSecondList(head);
		
		//��ת�ڶ�������
		p=reverseList(p);
		
		//���αȽϵ�һ������͵ڶ��������ֵ
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
		p=head.next;//��ʱpΪ�ڶ����������ʼ���
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



 
