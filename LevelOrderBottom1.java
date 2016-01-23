package com.icbc.suanfa;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root){
		LinkedList<List<Integer>> DoubleList=new LinkedList<List<Integer>>();
		if(root==null){
			return DoubleList;
		}
		Queue<TreeNode> q=new ArrayDeque<TreeNode>();
		q.offer(root);
		TreeNode monitor=new TreeNode(0);
		q.offer(monitor);
		List<Integer> list=new ArrayList<Integer>();
		while(q.size()>0){
			TreeNode temp=q.poll();
			if(temp!=monitor){
				list.add(temp.val);
				if(temp.left!=null){
					q.offer(temp.left);
				}
				if(temp.right!=null){
					q.offer(temp.right);
				}
			}else{
				DoubleList.addFirst(new ArrayList<Integer>(list));
				list.clear();
				if(q.size()>0){
					q.offer(monitor);
				}
			}
		}
//		DoubleList.addFirst(list);
		return DoubleList;
	}
}



 