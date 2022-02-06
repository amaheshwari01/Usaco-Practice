package com.practice;
//http://usaco.org/index.php?page=viewproblem2&cpid=964
public class pattern {
	public static void main(String[] args) {
		int n=11;//length of pat
		String pat="xabcdefgabcxdefg";
		
		int out=0;//output
		int i1=0;//index of the second letter
		System.out.println(n);	
		System.out.println(pat);
		for (var i =0; i<n;i++){//loop n times
			//i is the index of the first letter
			i1=i+1;//reset the index of the second letter to see if a bigger string matches
			while (i1+1<n){//loop while the the index of the second letter is not out of bounds
			
				if(find(pat,pat.substring(i, i1+1))) {//find if the pattern repeats

					i1++;//add another character to the search

				}
				else {
					break;
					
				}
				
			}
			if ((i1-i)>out) {//check if this stirng is the biggest
				out=i1-i;

			}
			
		}
		

		System.out.println(out+1);//always is going to be the biggest pattern +1

		

	}
	public static boolean find(String pat, String f) {
		if(pat.indexOf(f)!=pat.lastIndexOf(f)) { 
		return true;
		}
		else return false;
				
	}	
}
