package com.practice;
import java.util.*;
public class lonelyphoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		ArrayList<String> line = new ArrayList<String>();
		Collections.addAll(line,stdin.next().split(""));
		stdin.close();
		int count=0;
		for(int i=0;i<n;i++) {
			for(int x=i+1;x<n;x++) {
				
				if (x-i>1&&!valid(line.subList(i, x+1))) {
					//System.out.println(line.subList(i,x+1));
					count++;
				}
			}
		}
		System.out.println(count);

	}

	
	public static boolean valid(List<String> l) {
		int h=0;
		int g=0;
        for (String i : l) {
			if(i.equals("H")) {
				h++;
			}
			else {
				g++;
			}
		}
        return((h>1||h==0)&&(g>1||g==0));
	}
}
/*
5
GHGHG
*/