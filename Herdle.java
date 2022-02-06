package com.practice;
import java.util.*;
public class Herdle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		String[][] ans = new String[3][3];
		for(int i=0;i<3;i++) {
			ans[i]=stdin.next().split("");
		}
		String[][] guess = new String[3][3];
		for(int i=0;i<3;i++) {
			guess[i]=stdin.next().split("");
		}		
		stdin.close();
//		System.out.println(Arrays.deepToString(ans));
//		System.out.println(Arrays.deepToString(guess));
		int g=0;
		for(int i=0;i<3;i++) {
			for(int x=0;x<3;x++) {
			 if(ans[i][x].equals(guess[i][x])) {
				 g++;
				 ans[i][x]="-1";
				 guess[i][x]="-1";
			 }
			}
		}
//		System.out.println(Arrays.deepToString(ans));
//		System.out.println(Arrays.deepToString(guess));
		System.out.println(g);
		int y=0;
		for(int i=0;i<3;i++) {
			for(int x=0;x<3;x++) {
				int[] c=contains(ans,guess[i][x]);
				if(c[0]!=-1&&!guess[i][x].equals("-1")) {
					guess[i][x]="-1";
					ans[c[0]][c[1]]="-1";
					y++;
				}
			}
		}
//		System.out.println(Arrays.deepToString(ans));
//		System.out.println(Arrays.deepToString(guess));
		System.out.println(y);

		
	}
	public static int[] contains(String[][] arr,String l) {
		for(int i=0;i<3;i++) {
			int in=Arrays.asList(arr[i]).indexOf(l);
			if(in!=-1) {
				return new int[] {i,in};
			}
		}
		return new int[] {-1,-1};
			
	}

}
