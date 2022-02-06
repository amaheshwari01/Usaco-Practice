package com.practice;

import java.io.*;
import java.util.*;

public class race {
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
			int distrem=d;
			int crossthresh=0;
			//loop until distance is reached
		
		while (distrem>0) {
			//System.out.println("hi");
			//keep incresing speed until reached threshold
			if (speed<thresh) {
				speed+=1;
//				System.out.print(speed);
				dist+=speed;
				distrem -=speed;
				time++;
			}
//			if passing threshold		
			else if (speed >= thresh) {
	
			// if you can add two of the distance
		//test git
			if(((distrem)>=(speed+1)*2)) {
	  
					dist =(speed+1)*2;
					distrem = distrem-dist;
					time=time+2;
					speed++;
					
					if (crossthresh==0)
					{ time ++;
					distrem= distrem-thresh;
					dist +=thresh; }
					crossthresh=1;
			  }
			//else just add one of the distance
				else if (distrem >=speed) {
					time++;
					dist+=speed;
					distrem = distrem-speed;
					//speed++;
					
				}
//				else if (distrem>thresh) {
//					time++;
//					distrem-=thresh;
//					
//				}
//	
			
					
				//break if distrem is less than speed
				else {
					time++;
//				if (crossthresh==1)
//						{ time ++;}
					break;
				
				}
				
				}
					//					time++;
				}
			
			
	
		System.out.println(time);
		pw.println(time);
	

		}
		
	
		pw.close();
	
			
		}
	}

//10 





//while (dist<d) {
//	//build up to threshold
//	if (speed<thresh) {
//		speed+=1;
//		System.out.print(speed);
//		dist+=speed;
//		time++;
//	}
//	//once passed threhsold 
//	else if (speed>=thresh) {
//		//check if adding another valid
//å//		
//		else if(((dist+speed)<d)) {
//			dist+=speed;
//			System.out.print(speed);
//
//			time++;
//		}
//
//		else {
//			time++;
//			break;
//		}
//	
//		//speed+=1;
//		
//
//	}
	//System.out.println(speed+" "+dist+" "+time);

	//dist++;
