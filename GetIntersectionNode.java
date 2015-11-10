package com.icbc.suanfa;

public class Solution {
	public ListNode getIntersectionNode(ListNode headA,ListNode headB){
		if(headA==null||headB==null){
			return null;
		}
		int lengthA=1;
		int lengthB=1;
		ListNode temp1=headA;
		ListNode temp2=headB;
		while(temp1!=null){
			temp1=temp1.next;
			lengthA++;
		}
		while(temp2!=null){
			temp2=temp2.next;
			lengthB++;
		}
		int length_diff=Math.abs(lengthA-lengthB);
		if(lengthA>lengthB){
			temp1=headA;
			temp2=headB;
		}else{
			temp1=headB;
			temp2=headA;
		}
		while(length_diff>0){
			temp1=temp1.next;
			length_diff--;
		}
		while(headA!=null&&headB!=null&&temp1!=temp2){
			temp1=temp1.next;
			temp2=temp2.next;			
		}
		return temp1;
	}
}



 
