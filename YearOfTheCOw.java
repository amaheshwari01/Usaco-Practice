package com.practice;

import java.util.*;

public class YearOfTheCOw {
	public static HashMap<String,Integer> map=new HashMap<String,Integer>();
	public static HashMap<String,Integer> yearMap=new HashMap<String,Integer>();
	public static HashMap<String,Integer> outMap=new HashMap<String,Integer>();
	public static void main(String[] args) {
		String[] ZODIAC = {"Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig", "Rat"};

		yearMap.put("Bessie", 0);
		outMap.put("Bessie", 0);

		for (int i=0; i<ZODIAC.length; i++) {
			map.put(ZODIAC[i], i);
		}
			

		Scanner stdin = new Scanner(System.in);
		int n=stdin.nextInt();

		String[][] age = new String[n][4];
		for(int i=0;i<n;i++) {
			
			age[i][0]=stdin.next();
			stdin.next();
			stdin.next();
			age[i][1]=stdin.next();
			age[i][2]=stdin.next();
			stdin.next();
			stdin.next();
			age[i][3]=stdin.next();
			yearMap.put(age[i][0],map.get(age[i][2])) ;
			int d=outMap.get(age[i][3])+diff(yearMap.get(age[i][0]),age[i][1],yearMap.get(age[i][3]));
			//int d=diff(yearMap.get(age[i][0]),age[i][1],yearMap.get(age[i][3]));
			outMap.put( age[i][0],d);
		
			
		}
		stdin.close();
		System.out.println(Math.abs(outMap.get("Elsie")));
	}
	//first val of mil
	public static int diff(int first,String when,int second) {
		int diff=0;
		if(when.equals("previous")) {
			if(first-second>=0) {
				diff=(first-second)-12;
			}
			else {
				diff=first-second;
			}
		}
		if(when.equals("next")) {
			if(first-second<=0) {
				diff=12-second+first;
			}
			else {
				diff=first-second;
			}
		}
		return diff;
	}
	
}
/*
1. loop through what you are getting
2. Store value of what year first cow is into yearMap
3.check if last one is bessie
	if yes
		find the difference and store it in outMap
	if no
		find the difference between the two cows that are there  
		and store difference +outpmap value of second cow into outmap
		
4. print outmap value of elise
*/