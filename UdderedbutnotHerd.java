package com.practice;
//http://usaco.org/index.php?page=viewproblem2&cpid=1083
import java.util.*;

public class UdderedbutnotHerd {
	
	public static void main(String[] args) {
		//input and save words as arrays
		Scanner stdin = new Scanner(System.in);
		String[] cow = stdin.next().split("");
		String[] word = stdin.next().split("");
		stdin.close();
		int counter=0;
		int out=1;
		//iterate through array
		while(counter!=word.length-1) {
        for (String element: cow) {
        	if(counter!=word.length-1&&element.equals(word[counter])) {
        		counter++;
        	}
        }
        out++;
        }
		System.out.println(out);
		

}

}