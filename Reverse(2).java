package com.icbc.suanfa;

public class Solution {

	public int reverse(int x){
		int res=0;
		while(x!=0){
			//��res����10�Ľ������Integer�����ֵ���򷵻�0��
			//��res���ԣ�10�Ľ��С��Integer����Сֵ���򷵻�0��
			if(res!=0&&Integer.MAX_VALUE/res<10&&
					Integer.MAX_VALUE/res>-10){
				return 0;
			}
			res=res*10+x%10;
			x=x/10;
		}
		return res;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.reverse(1534236469));
	}
}
