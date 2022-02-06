package com.practice;

import java.util.*;

public class ComfortableCows {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int[][] cords=new int[n][2];
		int m=0;
		for(var i=0;i<n;i++) {
			cords[i][0]=stdin.nextInt();
			cords[i][1]=stdin.nextInt();
			if(cords[i][0]>m) {
				m=cords[i][0];
			}
			else if(cords[i][1]>m) {
				m=cords[i][1];
			}
		}
		stdin.close();
		//System.out.println(Arrays.deepToString(cords));
		m++;
	//	System.out.println(m);
		Integer[][] cows=new Integer[m][m];
		for(var i=0;i<n;i++) {
			int x=cords[i][0];
			int y=cords[i][1];
			int c=1;
			try {
			if(cows[x+1][y]!=0) {
				c++;
				cows[x+1][y]+=1;
				
				
			}
			}catch(Exception e) {
			}
			try {

			if(cows[x-1][y]!=0) {
				c++;
				cows[x-1][y]+=1;
			
			}
			}catch(Exception e) {
			}
			try {
			if(cows[x][y+1]!=0) {
				c++;
				cows[x][y+1]+=1;
			
			}
			}catch(Exception e) {
			}
			try {
			if(cows[x][y-1]!=0) {
				c++;
				cows[x][y-1]+=1;
				
			}
			}catch(Exception e) {
				}
			System.out.println(freq(cows,m));
			cows[x][y]=c;
		}
		//for(var i=0;i<m;i++) {
		//System.out.println(Arrays.toString(cows[i]));
		//}
		//System.out.println(Collections.frequency(Arrays.asList(cows[2]), 4));
	}
	public static int freq(Integer[][] cow,int m) {
		int fr=0;
		for(var i=0;i<m;i++) {
			fr+=Collections.frequency(Arrays.asList(cow[i]), 4);
		}
		return fr;

	}
}
/*
 * if(!(x+1>m)&&cows[x+1][y]!=0) {
				c++;
				cows[x+1][y]+=1;
			}
			if(!(x-1<0)&&cows[x-1][y]!=0) {
				c++;
				cows[x-1][y]+=1;
			}
			if(!(y+1>m)&&cows[x][y+1]!=0) {
				c++;
				cows[x][y+1]+=1;
			}
			if(!(y-1<0)&&cows[x][y-1]!=0) {
				c++;
				cows[x][y-1]+=1;
			}
			*/
