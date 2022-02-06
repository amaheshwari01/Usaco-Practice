package com.practice;

import java.io.*;
import java.util.*;

public class race3 {
	public static void main(String[] args) throws Exception {
		Scanner stdin = new Scanner(new File("race.in"));
		int d = stdin.nextInt();		
		int n = stdin.nextInt();		
		int[] k = new int[n];
		for(int i=0;i<n;i++) {
			k[i]=stdin.nextInt();
		}
		stdin.close();
		//System.out.println(Arrays.toString(k));
	 	PrintWriter pw = new PrintWriter(new FileWriter("race.out"));

		for(int i=0;i<n;i++) {
			//re intilize variables
			int thresh=k[i];
			int speed=0;
			int dist=0;
			int time=0;

			//loop until distance is reached
		
		while (dist<d) {
			//keep increasing speed until reached threshold
			speed++;
			dist+=speed;
			time++;
			if (dist>=d) {
				break;
			}
//			if passing threshold		
			if (speed >= thresh) {
				dist+=speed;
				time++;
			
			}
			
		
			
		}
		System.out.println(time);
		pw.println(time);
		}
		
	
		pw.close();
	
			
		}
	}


