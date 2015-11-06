package com.icbc.suanfa;

import java.util.Stack;

public class Solution {
	public boolean isSymmetric(TreeNode root){
		if(root==null){
			return true;
		}

		Stack<TreeNode> stack=new Stack<TreeNode>();
		stack.push(root.left);
		stack.push(root.right);
		
		while(!stack.isEmpty()){
			TreeNode p1=stack.pop();
			TreeNode p2=stack.pop();
			if(p1==null&&p2==null){
				continue;
			}
			if((p1!=null&&p2==null)||(p1==null&&p2!=null)){
				return false;
			}
			if(p1.val!=p2.val){
				return false;
			}
			stack.push(p1.left);
			stack.push(p2.right);
			stack.push(p1.right);
			stack.push(p2.left);
		}
		return true;
	}
}



 