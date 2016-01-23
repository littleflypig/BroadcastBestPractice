package com.icbc.suanfa;

public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
		//����Ŀ��ڵ���ͨ������ֵ��Ǹ�����������ĳ��Ŀ����
        if(root == null || root == p || root == q) return root;
        //�鿴���������Ƿ���Ŀ���㣬û��Ϊnull
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        //�鿴�������Ƿ���Ŀ��ڵ㣬û��Ϊnull
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //����Ϊ�գ�˵��������������Ŀ���㣬�򹫹����Ⱦ��Ǳ���
        if(left!=null&&right!=null) return root;
        //���������Ŀ��ڵ㣬��������ϱ��Ϊ��Ŀ��ڵ�
        return left == null ? right : left;
	}

}



 