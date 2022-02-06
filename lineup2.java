package com.practice;

//Solution to 2019 December USACO Bronze Problem: Livestock Lineup

import java.util.*;
import java.io.*;

public class lineup2 {

	final public static String[] COWS = {"Beatrice", "Belinda", "Bella", "Bessie", "Betsy", "Blue", "Buttercup", "Sue"};

	public static int n;
	public static int[][] list;
	public static int counter=0;
	private static ArrayList<ArrayList<String>> arr = new ArrayList<>();

	public static void main(String[] args) throws Exception {
	
		// For easy look up.
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for (int i=0; i<COWS.length; i++) map.put(COWS[i], i);
		
		// Read in the constraints.
		Scanner stdin = new Scanner(new File("lineup.in"));
		n = stdin.nextInt();
		
		// Store these by indexes.
		list = new int[n][2];
		for (int i=0; i<n; i++) {
			list[i][0] = map.get(stdin.next());
			for (int j=0; j<4; j++) stdin.next();
			list[i][1] = map.get(stdin.next());
		}
		
		System.out.println(map);
		System.out.println(Arrays.deepToString(list));
		// Set up permutation algorithm and run it!
		int[] perm = new int[COWS.length];
		for(int i=0;i<perm.length;i++) {
			perm[i]=i+1;
		}		
		Permutation(perm,perm.length,perm.length);
		Collections.sort(arr, new Comparator<ArrayList<String>>() {    
	        @Override
	        public int compare(ArrayList<String> o1, ArrayList<String> o2) {
	            return o1.get(0).compareTo(o2.get(0));
	        }               
	});
		// Output to file.
		System.out.println(arr);

		PrintWriter out = new PrintWriter(new FileWriter("lineup.out"));
		for (int i=0; i<COWS.length; i++)
			System.out.println(COWS[perm[i]]);

			//out.println(COWS[perm[i]]);
		out.close();		
		stdin.close();
	}
	
	  public static void Permutation(int a[], int size, int n)
	    {
	        // if size becomes 1 then prints the obtained
	        // permutation
	        if (size == 1 && valid(a)) {
	            List<String> list = Arrays.asList(a.toString());          
	        	arr.add((ArrayList<String>)list);
	        }
	        
	        for (int i = 0; i < size; i++) {
	        	Permutation(a, size - 1, n);
	 
	            // if size is odd, swap 0th i.e (first) and
	            // (size-1)th i.e (last) element
	            if (size % 2 == 1) {
	                int temp = a[0];
	                a[0] = a[size - 1];
	                a[size - 1] = temp;
	            }
	 
	            // If size is even, swap ith
	            // and (size-1)th i.e last element
	            else {
	                int temp = a[i];
	                a[i] = a[size - 1];
	                a[size - 1] = temp;
	            }
	        }
	    }
	
	public static boolean valid(int[] perm) {
		
		// Helpful to have backwards lookup table.
		int[] indexOf = new int[perm.length];
		for (int i=0; i<perm.length; i++)
			indexOf[perm[i]] = i; 
		
		// Go through each list pairing and see if they are located adjacent in the permutation array or not.
		for (int i=0; i<n; i++) 
			if (Math.abs(indexOf[list[i][0]]-indexOf[list[i][1]]) != 1)
				return false;
			
		// If we get here, we're good.
		return true;
	}
}