package com.practice;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Arrays;
//http://usaco.org/index.php?page=viewproblem2&cpid=963
public class cowGymnastics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int k=0;
		int n=0;
		int ranks[][]=new int[k][n];
		int out=0;
		int pairs=0;
		int plist[][];
		int pcount=0;
		int rank1[];
		try {
		      File myObj = new File("/Users/aayanmaheshwari/eclipse-workspace/USACO/src/com/practice/hi.txt");
		      Scanner myReader = new Scanner(myObj);
		      String data = myReader.nextLine();
		      k=Character.getNumericValue(data.charAt(0));
		      n=Character.getNumericValue(data.charAt(2));
		      ranks = new int[k][n]; 
		    
		       for (int x = 0; x < k; x++) {
		        data = myReader.nextLine();
		        for (int i = 0; i < n; i++) {
		        	ranks[x][i]=Character.getNumericValue(data.charAt(i*2));
		        }
		      }
		        System.out.println(Arrays.deepToString(ranks));

		      myReader.close();
		    }
		catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	
	    for (int x = 1; x <n; x++) {
	    	pairs+=x;
	    }
	    plist=new int[pairs][2];
	    rank1=ranks[0];
	    for (int x = n; x>1; x--) {

		    for (int i = 1; i<x; i++) {
		    	plist[pcount][0]=rank1[0];
		    	plist[pcount][1]=rank1[i];
		    	pcount++;

		    }
	    	int r0=rank1[0];

		    for (int i = 0; i<rank1.length-1; i++) {

		    	rank1[i]=rank1[i+1];
		    	
		    }
	    	rank1[(rank1.length)-1]=r0;
	    }
        System.out.println(Arrays.deepToString(plist));
        
        
	    for (int i = 1; i<ranks.length; i++) {
	    
		    for (int e = 0; e<pairs; e++) {
		    	//System.out.println(findIndex(rank1,2)+"   "+plist[e][1]);
		    	if(findIndex(ranks[i],plist[e][0])>findIndex(ranks[i],plist[e][1])){
		    		plist[e]=new int[2];
		    		//System.out.println(findIndex(ranks[i],plist[e][0])+"     "+findIndex(ranks[i],plist[e][1]));
		    	}	
		    }
	        
	    }
	    
	    for (int e = 0; e<pairs; e++) {
	    	if(plist[e][0]!=0) {
	    		out++;
	    	}
	    }
	   
        System.out.println(Arrays.deepToString(plist));

        System.out.println(out);
	    
	
	
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
