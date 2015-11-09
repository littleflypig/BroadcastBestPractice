package com.icbc.suanfa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		if(root==null){
			return result;
		}
		TreeNode node0=new TreeNode(0);//哨兵结点
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.offer(root);
		queue.offer(node0);
		List<Integer> tempList=new ArrayList<Integer>();//存放每一层结点
		while(queue.size()>0){
			TreeNode tempNode=queue.poll();
			if(tempNode!=node0){
				tempList.add(tempNode.val);
				if(tempNode.left!=null){
					queue.offer(tempNode.left);
				}
				if(tempNode.right!=null){
					queue.offer(tempNode.right);
				}
			}else{
				result.add(new ArrayList<Integer>(tempList));
				tempList.clear();
				if(queue.size()>0){
					queue.offer(node0);
				}
			}
		}
		return result;
	}
}



 
