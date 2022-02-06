package com.practice;
import java.util.*;
//http://usaco.org/index.php?page=viewproblem2&cpid=1060
public class DaisyChains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
		Scanner stdin = new Scanner(System.in);
		int n=stdin.nextInt();
		ArrayList<Integer> petals= new ArrayList<Integer>();	

		 for (int i=0; i<n; i++)
			 petals.add(stdin.nextInt());
			 
		stdin.close();
		int count=0;				 

		//loop through and generate every pair 
		 for (int x=0; x<n;x++) {
			 for (int y=x+1; y<n; y++) {
				 
				double avg = 0;

				 for (int i=0; i<(y-x+1); i++) {
					 avg+=petals.get(i+x);

				 
				 }
				 avg=avg/(y-x+1);
			//	 System.out.println(avg+" "+x+" "+y);
				 if (avg%1.0==0.0&&petals.subList(x,y+1).contains((int)avg)) {
					// System.out.println(avg+" "+x+" "+y);

					 count++;
					 
				 }
			 } 
			 
		 }

		 System.out.println(count+n);
		
	}

}
//1 2 4 6 2 5 9
//0 1 2 3 4 5 6  
//double avg=((double) petals.get(x)+(double) petals.get(y))/2;
//if (x!=y&&avg%1.0==0.0&&petals.contains((int)avg)&&!set.contains("("+petals.get(x)+","+petals.get(y)+")")&&!set.contains("("+petals.get(y)+","+petals.get(x)+")")) {
//	 System.out.println("("+petals.get(x)+","+petals.get(y)+")"+avg);
//
//	 set.add("("+petals.get(x)+","+petals.get(y)+")");
//	 count++;
//}