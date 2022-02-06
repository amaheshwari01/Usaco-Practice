package com.practice;

import java.util.*;
import java.io.*;

public class race2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("race.in"));
		PrintWriter pw = new PrintWriter(new File("race.out")); 
		int k = sc.nextInt();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int minspeed = sc.nextInt(); 
			pw.println(solve(k, minspeed));
		}
		pw.close();
	}

	public static int solve(int dist, int minspeed) {
		int d=0;
		int timeused = 0;
		for(int currspeed = 1;; currspeed++) {
			d += currspeed;
			timeused++;
			if(d >= dist) { 
				return timeused; 
			}
			if(currspeed >= minspeed) {
				d += currspeed;
				timeused++;
				if(d>= dist) { 
					return timeused; 
				}
			}
		}
	}
}