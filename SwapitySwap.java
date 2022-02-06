package com.practice;
import java.util.*;
import java.io.*;

public class SwapitySwap {
	public static void main(String[] args) throws IOException {
 	    ArrayList<Integer> line = new ArrayList<Integer>();
		ArrayList<Integer> sub;
 		BufferedReader br = new BufferedReader(new FileReader("swap.in"));
 		StringTokenizer st = new StringTokenizer(br.readLine());

 		int n = Integer.parseInt(st.nextToken());
 		int k = Integer.parseInt(st.nextToken());
 		st = new StringTokenizer(br.readLine());

 		int a1 = Integer.parseInt(st.nextToken())-1;
 	 	int a2 = Integer.parseInt(st.nextToken())-1;
		st = new StringTokenizer(br.readLine());

 		int b1 = Integer.parseInt(st.nextToken())-1;
 		int b2 = Integer.parseInt(st.nextToken())-1;
  
 		for(int i=0; i < n; i++) {      

 			line.add(i+1);
 		}
 		br.close();
 		for(int x=0; x < k; x++) {     
 			sub = new ArrayList<Integer>(line.subList(a1, a2+1));
 			line.subList(a1, a2+1).clear();
 			Collections.reverse(sub);
 			line.addAll(a1,sub);
			
 			sub = new ArrayList<Integer>(line.subList(b1, b2+1));
 			line.subList(b1, b2+1).clear();
 			Collections.reverse(sub);
 			line.addAll(b1,sub);
 		}
 		PrintWriter pw = new PrintWriter(new FileWriter("swap.out"));
    	for(int i = 0; i < n; i++) {
        	System.out.println(line.get(i));
        	pw.println(line.get(i));
        }
      	pw.close();
	       
	}
}
