package com.icbc.suanfa;

/**
 * ���һ������Ϊn�Ļ�������
 * */
public class Solution {
	public ListNode removeNthFromEnd(ListNode head,int n){
		if(head==null){
			return null;
		}
		ListNode p=head;//p��㱣�洰�ڵ����ұ�
		ListNode q=head;///q��㱣�洰�ڵ������
		ListNode t=new ListNode(head.val);//t��㱣��q�����ڱ߽��
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



 
