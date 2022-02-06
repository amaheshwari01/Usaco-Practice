package com.practice;
import java.io.*;

 

public class BreedFlip {

 public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 		BufferedReader br = new BufferedReader(new FileReader("breedflip.in"));
 		int n = Integer.parseInt(br.readLine());
 		String cows[][]= new String[2][1];

 		for(int i=0; i < 2; i++) {      	
 			cows[i]=br.readLine().split("");
 		}
 		br.close();

 		int out=0;
	   	for(int i=0;i<n;i++){

           String sub=cows[0][i];
           String sub2=cows[1][i];

          if (!sub.equals(sub2)) {
        	  while(true) {
        		  if(i<n&&!cows[0][i+1].equals(cows[1][i+1])) {
        			  i++;
        		  }
        		  else {
        		  break;
        		  }
        		  
        		  
        	  }
        	  out+=1;
    	     // System.out.println(String.valueOf(sub)+"-"+String.valueOf(sub2));

        	
           }

                
              
             
        	
        }
	   	
	 	PrintWriter pw = new PrintWriter(new FileWriter("breedflip.out"));
    	System.out.println(out);
    	pw.println(out);
 
      	pw.close();
     }

}
