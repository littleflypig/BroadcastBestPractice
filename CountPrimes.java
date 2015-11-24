package com.icbc.suanfa;

//使用埃拉托斯特尼筛选法
public class Solution {
	public int countPrimes(int n){
		if(n<=2){
			return 0;
		}
		boolean[] isprime=new boolean[n];
		for(int i=0;i<n;i++){
			isprime[i]=true;
		}
		isprime[0]=isprime[1]=false;
		for(int i=0;i<Math.sqrt(n);i++){
			if(isprime[i]){
				for(int j=2*i;j<n;j+=i){
					isprime[j]=false;
				}
			}
		}
		
		int count=0;
		for(int i=0;i<n;i++){
			if(isprime[i]){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.countPrimes(13));
	}
}
