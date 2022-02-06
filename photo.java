package com.practice;

import java.util.*;
import java.io.*;



//http://usaco.org/index.php?page=viewproblem2&cpid=964
public class photo {
	public static void main(String[] args) throws IOException {
      
      	
      	BufferedReader br = new BufferedReader(new FileReader("photo.in"));
      	int n = Integer.parseInt(br.readLine());
      	int[] str = new int[n-1];
      	StringTokenizer st = new StringTokenizer(br.readLine());
		
      	for(int i = 0; i < n-1; i++) {
        	str[i] = Integer.parseInt(st.nextToken());
        }
      	br.close();
      	int[] out=new int[n];
      	boolean stop=false;
      	for(int i = 1; i < str[0]; i++) {
           	out[0]=i;
           //	System.out.println(i);
        	for(int x = 0; x < n-1; x++) {
              int value=str[x]-out[x];
              if(value>0&&value<=n&&findIndex(out, value)==-1){
                out[x+1]=value;
                }
              else {
                stop=true;
                out = new int[n];

                break;
              }
            }
          if (!stop){
          	break;
          }
      	stop=false;

        }

        
        
       
    	PrintWriter pw = new PrintWriter(new FileWriter("photo.out"));
    	System.out.print(out[0]);
    	pw.print(out[0]);
    	for(int i = 1; i < n; i++) {
        	System.out.print(" "+out[i]);
        	pw.print(" "+out[i]);
        }
      	pw.close();
    
    }
  
	public static int findIndex(int arr[], int t)
    {
 
        // if array is Null
        if (arr == null) {
            return -1;
        }
 
        // find length of array
        int len = arr.length;
        int i = 0;
 
        // traverse in the array
        while (i < len) {
 
            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
  
}