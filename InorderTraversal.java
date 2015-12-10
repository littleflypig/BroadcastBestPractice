package com.icbc.suanfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	public List<Integer> inorderTraversal(TreeNode root){
		Stack<TreeNode> stack=new Stack<TreeNode>();
		List<Integer> list=new ArrayList<Integer>();
		if(root==null){
			return list;
		}
		TreeNode p =root;
		while(p!=null||!stack.isEmpty()){
			while(p!=null){
				stack.push(p);
				p=p.left;
			}
			if(!stack.isEmpty()){
				p=stack.pop();
				list.add(p.val);
				p=p.right;
			}
		}
		return list;
	}
	
}
