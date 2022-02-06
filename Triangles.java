package com.practice;
import java.io.*;
import java.util.*; 

public class Triangles {
	 public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
	 		BufferedReader br = new BufferedReader(new FileReader("triangles.in"));
	 		int n = Integer.parseInt(br.readLine());
	 		int posts[][]= new int[n][2];
	  
	 		for(int i=0; i < n; i++) {      
		 		StringTokenizer st = new StringTokenizer(br.readLine());

	 			posts[i][0]=Integer.parseInt(st.nextToken());
	 			posts[i][1]=Integer.parseInt(st.nextToken());

	 		}
	 		br.close();
	 		
	 		System.out.println(Arrays.deepToString(posts));
	 			
	 		
	 		int out=0;
	 		for(int a=0; a < n; a++) {      	
		 		for(int b=0; b < n; b++) {      	
			 		for(int c=0; c < n; c++) {
			 			int x[]=posts[a];
			 			int y[]=posts[b];
			 			int z[]=posts[c];
			 			int x1=x[0];
			 			int x2=y[0];
			 			int x3=z[0];
			 			int y1=x[1];
			 			int y2=y[1];
			 			int y3=z[1];

				 		if(x!=y&&x!=z&&y!=z&&(x[0]==y[0]||x[0]==z[0]||z[0]==y[0])&&(x[1]==y[1]||x[1]==z[1]||z[1]==y[1])) {
				 			int area=(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
				 			if(area>out) {
				 				out=area;
				 			}
				 		}
				 		

			 		}
		 		}
			}
	 		
	 		
	 		
	 		
		 	PrintWriter pw = new PrintWriter(new FileWriter("triangles.out"));
	 		System.out.println(out);
	 		pw.println(out);
	      	pw.close();
	      	
	      	
	      	
	      	
	      	
	     }
		


}
