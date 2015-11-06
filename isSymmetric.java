package com.icbc.suanfa;

public class Solution {
	public boolean isSymmetric(TreeNode root){
		if(root==null){
			return true;
		}
		return symmetric(root.left, root.right);
	}
	
	public boolean symmetric(TreeNode left,TreeNode right){
		//每个左子树的结点与右子树的毕露 果相等；左子树的左子树与右子树的右子树相等；左子树的右子树与右子树的左子树相等；
		if(left==null&&right==null){
			return true;
		}
		if((left!=null&&right==null)||(left==null&&right!=null)){
			return false;
		}
		if(left.val!=right.val){
			return false;
		}
		return symmetric(left.left, right.right)&&symmetric(left.right, right.left);
	}
}



 