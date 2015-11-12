package com.icbc.suanfa;

public class Solution {
	public int minDepth(TreeNode root){
		if(root==null){
			return 0;
		}else if(root.left==null&&root.right==null){
			return 1;
		}else if(root.left!=null&&root.right==null){
			return 1+minDepth(root.left);
		}else if(root.left==null&&root.right!=null){
			return 1+minDepth(root.right);
		}
		return 1+Math.min(minDepth(root.left), minDepth(root.right));
	}
}



 
