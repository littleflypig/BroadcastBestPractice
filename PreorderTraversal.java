package com.icbc.suanfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	public List<Integer> preorderTraversal(TreeNode root){
		Stack<TreeNode> stack=new Stack<TreeNode>();
		List<Integer> list=new ArrayList<Integer>();
		if(root==null){
			return list;
		}
		stack.add(root);
		while(!stack.isEmpty()){
			TreeNode temp=stack.pop();
			list.add(temp.val);
			if(temp.right!=null){
				stack.push(temp.right);
			}
			if(temp.left!=null){
				stack.push(temp.left);
			}
		}
		return list;
	}
}
