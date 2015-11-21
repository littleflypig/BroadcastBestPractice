package com.icbc.suanfa;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private List<String> list=new ArrayList<String>();
	public List<String> binaryTreePaths(TreeNode root){
		if(root==null){
			return list;
		}
		String s="";
		f1(root,s);
		return list;
	}
	
	public void f1(TreeNode root,String s){
		if(root.left==null&&root.right==null){
			s+=String.valueOf(root.val);
			list.add(s);
		}else{
			s+=String.valueOf(root.val)+"->";
			if(root.left!=null){
				f1(root.left,s);
		     }
			if(root.right!=null){
				f1(root.right,s);
			}
		}
	}
	
	public static void main(String[] args) {
		Solution solution=new Solution();
		TreeNode root=new TreeNode(1);
		solution.binaryTreePaths(root);
	}
}
