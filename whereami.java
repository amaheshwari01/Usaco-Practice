package com.practice;

import java.util.*;
import java.io.*;


//http://usaco.org/index.php?page=viewproblem2&cpid=964
public class whereami {
	public static void main(String[] args) throws IOException {
      
      
      	BufferedReader br = new BufferedReader(new FileReader("whereami.in"));
      	int n = Integer.parseInt(br.readLine());
      	String str = br.readLine();
      	br.close();
      
      	int out=0;
      	for(int i=1;i<=n;i++){
          	boolean b=false;
        	HashSet<String> set = new HashSet<String>();
			for(int x=0; x<n-i+1; x++){
              String sub=str.substring(x,x+i);
              if(!set.contains(sub)){
                set.add(sub);
              }
              else{
              	b=true;
                break;
              }
            }
        	if(!b){
              out=i;
              break;
            }
        }
  
      	PrintWriter pw = new PrintWriter(new FileWriter("whereami.out"));
      	pw.println(out);
      	System.out.println(out);
      	pw.close();
      
      // abcdabc

	}
}
