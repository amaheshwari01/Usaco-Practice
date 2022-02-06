package com.practice;
import java.util.*;
public class juststalling {
	public static void main(String[] args) {        
		int a[] = new int[8];
		for(int i=0;i<8;i++) {
			a[i]=i+1;
		}
		Permutation(a,a.length,a.length);
		
	}
	  public static void Permutation(int a[], int size, int n)
	    {
	        // if size becomes 1 then prints the obtained
	        // permutation
	        if (size == 1)
	        	System.out.println(Arrays.toString(a));
	 
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

//	public static void permutation(String prefix, ArrayList<String> str) {
//	    int n = str.length();
//	    if (n == 0) perm.add(prefix);
//	    else {
//	        for (int i = 0; i < n; i++)
//	            permutation(prefix + str.get(i), str.subList(0, i) + str.subList(i+1, n));
//	    }
//	}
}
