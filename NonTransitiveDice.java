package com.practice;
import java.util.*;

public class NonTransitiveDice {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n=stdin.nextInt();
		Integer[][][] dice=new Integer[n][2][4];
		for(int i=0;i<n;i++) {
			for(int x=0;x<2;x++) {
				for(int y=0;y<4;y++) {

					dice[i][x][y]=stdin.nextInt();
					//Collections.sort(Arrays.asList(dice[i][x]));
				}
			}
		}
	//	System.out.println(Arrays.deepToString(dice));
		stdin.close();
		ArrayList<String> poss= new ArrayList<String>();
		for(int a=0;a<10;a++) {
			for(var b=0;b<10;b++) {
				if(a==b) {
					continue;
				}
				for(var c=0;c<10;c++) {
					if(a==c||b==c) {
						continue;
					}
					for(var d=0;d<10;d++) {
						if(a==d||b==d||c==d) {
							continue;
						}
						String s[]= {String.valueOf(a),String.valueOf(b),String.valueOf(c),String.valueOf(d)};
						Collections.sort(Arrays.asList(s));
						String i=s[0]+s[1]+s[2]+s[3];
						if(!poss.contains(i)) {
		//					System.out.println(i);

							poss.add(i);

						}
					}	
				}	
			}
		}
		
		
//		
//		ArrayList<Integer> p1= new ArrayList<Integer>();
////		p1.add(Character.getNumericValue(poss.get(x).charAt(0)));
////		p1.add(Character.getNumericValue(poss.get(x).charAt(1)));
////		p1.add(Character.getNumericValue(poss.get(x).charAt(2)));
////		p1.add(Character.getNumericValue(poss.get(x).charAt(3)));
//		p1.add(1);
//		p1.add(4);
//		p1.add(8);
//		p1.add(9);
//		ArrayList<Integer> d1= new ArrayList<Integer>(Arrays.asList(dice[0][0]));
//		ArrayList<Integer> d2= new ArrayList<Integer>(Arrays.asList(dice[0][1]));
//		System.out.println(Arrays.toString(great(d1,d2)));
//		System.out.println(Arrays.toString(great(d1,p1)));
//		System.out.println(Arrays.toString(great(d2,p1)));
//		System.out.println(ntd(d1,d2,p1));
//
//
//		
		for(int i=0;i<n;i++) {
			ArrayList<Integer> d1= new ArrayList<Integer>(Arrays.asList(dice[i][0]));
			ArrayList<Integer> d2= new ArrayList<Integer>(Arrays.asList(dice[i][1]));
			Collections.sort(d1);
			Collections.sort(d2);

			//System.out.println(g);
			//System.out.println(d1);
		
			boolean b=false;
			for(int x=0;x<poss.size();x++) {
				ArrayList<Integer> p1= new ArrayList<Integer>();
				p1.add(Character.getNumericValue(poss.get(x).charAt(0))+1);
				p1.add(Character.getNumericValue(poss.get(x).charAt(1))+1);
				p1.add(Character.getNumericValue(poss.get(x).charAt(2))+1);
				p1.add(Character.getNumericValue(poss.get(x).charAt(3))+1);
//				p1.add(1);
//				p1.add(4);
//				p1.add(8);
//				p1.add(9);
			//	System.out.println(p1);
				if (ntd(d1,d2,p1)||ntd(d1,p1,d2)||ntd(d2,d1,p1)||ntd(d2,p1,d1)||ntd(p1,d2,d1)||ntd(p1,d1,d2)) {
				//	System.out.println(p1);
					System.out.println("yes");
					b=true;
					break;
				}
				

			}
			if(!b) {
				System.out.println("no");
			}
		}
		
//		
//		ArrayList<Integer> p1= new ArrayList<Integer>();
//		ArrayList<Integer> p2= new ArrayList<Integer>();
//		p1.add(1);
//		p1.add(4);
//		p1.add(8);
//		p1.add(9);
//		p2.add(4);
//		

	}
	public static boolean ntd(ArrayList<Integer> d1,ArrayList<Integer> d2,ArrayList<Integer> p1) {
;
		return ((great(d1,d2)==1&&great(d2,p1)==1&&great(p1,d1)==1));

		
		
	}

	public static int great(ArrayList<Integer> d1,ArrayList<Integer> d2) {
		int di1=0;
		int di2=0;
	

		for (int i=0;i<d1.size();i++) {
			for (int x=0;x<d2.size();x++) {
			//	System.out.println(d1.get(i)+" "+d2.get(x)+" "+(d1.get(i)>d2.get(x)));
				if(d1.get(i)>d2.get(x)) {
					di1++;
				}
				else if (d1.get(i)<d2.get(x)){
					di2++;
	
				}
			}
		}
		if(di1>di2) {
		return  1;
		}
		if(di1<di2) {
			return  2;
			}
		return -1;

	}
}
//ArrayList<Integer> p1= new ArrayList<Integer>();
////p1.add(Character.getNumericValue(poss.get(x).charAt(0)));
////p1.add(Character.getNumericValue(poss.get(x).charAt(1)));
////p1.add(Character.getNumericValue(poss.get(x).charAt(2)));
////p1.add(Character.getNumericValue(poss.get(x).charAt(3)));
//p1.add(1);
//p1.add(4);
//p1.add(8);
//p1.add(9);
//System.out.println(great(d1,p1));
