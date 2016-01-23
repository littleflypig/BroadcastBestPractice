package com.icbc.suanfa;

import java.util.HashSet;

public class Solution {
	public boolean isValidSudoku(char[][] board){
		HashSet<Character> hashset=new HashSet<Character>();
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
					if(board[i][j]=='.'){
						continue;
					}
					if(hashset.contains(board[i][j])){
						return false;
					}
					hashset.add(board[i][j]);
			}
			hashset.clear();
		}
		
		for(int j=0;j<9;j++){
			for(int i=0;i<9;i++){
					if(board[i][j]=='.'){
						continue;
					}
					if(hashset.contains(board[i][j])){
						return false;
					}
					hashset.add(board[i][j]);
			}
			hashset.clear();
		}
		
		for(int k=0;k<9;k++){
			for(int i=k/3*3;i<k/3*3+3;i++){
				for(int j=(k%3)*3;j<(k%3)*3+3;j++){
					if(board[i][j]=='.'){
						continue;
					}
					if(hashset.contains(board[i][j])){
						return false;
					}
					hashset.add(board[i][j]);
				}
			}
			hashset.clear();
		}
		return true;
	}
}



 
