package com.icbc.suanfa;

public class Solution {
	public boolean hasPathSum(TreeNode root,int sum){
		if(root==null){
			return false;
		}
		currentPathSum(root,0,sum);
		if(result==true){
			return true;
		}else{
			return false;
		}
	}
	boolean result=false;
	public void currentPathSum(TreeNode root,int current,int sum){
		if(root.left==null&&root.right==null){
			if(current+root.val==sum){
				result=true;
			}
		}
		if(root.left!=null){
			currentPathSum(root.left,current+root.val,sum);
		}
		if(root.right!=null){
			currentPathSum(root.right,current+root.val,sum);
		}
	}
}



 
