package com.practice;
import java.util.*;
//http://usaco.org/index.php?page=viewproblem2&cpid=1059
public class DoYouKnowYourABCs {
	public static void main(String[] args) {
		
		// Read in values.
		Scanner stdin = new Scanner(System.in);
		int[] vals = new int[7];
		for (int i=0; i<7; i++)
			 vals[i] = stdin.nextInt();
			 
		stdin.close();
		Arrays.sort(vals);
		System.out.println(vals[0]+" "+vals[1]+" "+(vals[6]-vals[0]-vals[1]));
		
	}		 

}
