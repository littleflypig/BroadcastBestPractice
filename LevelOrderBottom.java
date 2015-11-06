package com.icbc.suanfa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root){
		List<List<Integer>> DoubleList=new ArrayList<List<Integer>>();
		if(root==null){
			return DoubleList;
		}
		
		Stack<List<Integer>> stack=new Stack<List<Integer>>();
		int count=0;//count代表下一次要从队列中取count个子结点
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.offer(root);
		count++;//
		while(!q.isEmpty()){
			List<Integer> list=new ArrayList<Integer>();
			TreeNode temp;
			int currentNode=count;
			count=0;//count重新统计下一层子结点数
			while(currentNode>0){
				temp=q.poll();
				list.add(temp.val);
				if(temp.left!=null){
					q.offer(temp.left);
					count++;
				}
				if(temp.right!=null){
					q.offer(temp.right);
					count++;
				}
				currentNode--;
			}
			stack.push(list);
		}
		while(!stack.isEmpty()){
			DoubleList.add(stack.pop());
		}
		return DoubleList;
	}
}



 