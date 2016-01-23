package com.icbc.suanfa;

public class Solution {
	public TreeNode invertTree(TreeNode root){
		if(root==null||(root.left==null&&root.right==null)){
			return root;
		}else if(root.left==null&&root.right!=null){
			root.left=invertTree(root.right);
			root.right=null;
			return root;
		}else if(root.right==null&&root.left!=null){
			root.right=invertTree(root.left);
			root.left=null;
			return root;
		}else{
			TreeNode temp1=invertTree(root.right);
			TreeNode temp2=invertTree(root.left);
			root.left=temp1;
			root.right=temp2;
			return root;
		}
	}
}
