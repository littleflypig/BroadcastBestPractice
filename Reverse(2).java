package com.icbc.suanfa;

public class Solution {

	public int reverse(int x){
		int res=0;
		while(x!=0){
			//若res乘以10的结果大于Integer的最大值，则返回0；
			//若res乘以－10的结果小于Integer的最小值，则返回0；
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
