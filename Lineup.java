package com.practice;
import java.io.*;
import java.util.*; 

public class Lineup {
	public static ArrayList<ArrayList<Integer>> out = new ArrayList<ArrayList<Integer>>();
  	public static int[][] rest=new int[0][0];
  	public static int n;
	public static void main(String[] args) throws IOException {
		String[] cows = {"Beatrice", "Belinda", "Bella", "Bessie", "Betsy", "Blue", "Buttercup", "Sue"};
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for (int i=0; i<cows.length; i++) {
			map.put(cows[i], i);
		}
		Scanner stdin = new Scanner(new File("lineup.in"));
		n = stdin.nextInt();
      	rest=new int[n][2];
      	for (int i=0; i<n; i++) {
			rest[i][0] = map.get(stdin.next());
			stdin.next();
			stdin.next();
			stdin.next();
			stdin.next();
			rest[i][1] = map.get(stdin.next());
		}
      	stdin.close();
      	Integer[] a= {0,1,2,3,4,5,6,7};
		perm(a,8,8);
		ArrayList<String> first = new ArrayList<String>(); 
		for (int i=0; i<out.size(); i++) {
			first.add(String.valueOf(out.get(i).get(0))+String.valueOf(out.get(i).get(1))+String.valueOf(out.get(i).get(2))+
					String.valueOf(out.get(i).get(3))+String.valueOf(out.get(i).get(4))+String.valueOf(out.get(i).get(5))+
					String.valueOf(out.get(i).get(6))+String.valueOf(out.get(i).get(7)));
		
			
		}	
		Collections.sort(first);
		String[] o=first.get(0).split("");
		PrintWriter pw = new PrintWriter(new FileWriter("lineup.out"));

		for (int i=0; i<8; i++) {
			//System.out.println(cows[Integer.parseInt(o[i])]);
			pw.println(cows[Integer.parseInt(o[i])]);
		}
		pw.close();
		//System.out.println(first);

	}
	public static void perm(Integer a[], int size, int n)
    {
        // if size becomes 1 then prints the obtained
        // permutation
        if (size == 1&&valid(a)) {
            List<Integer>  list = (List<Integer>) Arrays.asList(a);

        	out.add(new ArrayList<Integer>(list));
        }
 
        for (int i = 0; i < size; i++) {
            perm(a, size - 1, n);
 
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
	public static boolean valid(Integer[] a)
	{
		for(int i =0;i<n;i++) {
			if(Math.abs(Arrays.asList(a).indexOf(rest[i][0])-Arrays.asList(a).indexOf(rest[i][1]))!=1) {
				return false;
			}
		}
		return true;

	}
}
//
//ArrayList<ArrayList<String>> in = new ArrayList<>(n);
//
//for(int i=0; i < n; i++) {
//    in.add(new ArrayList());
//}
//for(var i=0;i<n;i++) {
//	text[i]=text[i][0].split(" ");
//	in.get(i).add(text[i][0]);
//	in.get(i).add(text[i][5]);
//
//    Collections.sort(in.get(i));
//
//
//}
//
//
//Collections.sort(in, new Comparator<ArrayList<String>>() {    
//    @Override
//    public int compare(ArrayList<String> o1, ArrayList<String> o2) {
//        return o1.get(0).compareTo(o2.get(0));
//    }               
//});
//System.out.println(in);
//ArrayList<String> cows = new ArrayList<String>();
//cows.add("Beatrice");
//cows.add("Belinda");
//cows.add("Bella");
//cows.add("Bessie");
//cows.add("Betsy");
//cows.add("Blue");
//cows.add("Buttercup");
//cows.add("Sue");
//
//
//
//for(var i=0;i<8;i++) {
//	int moo=0;
//	for(var x=0;x<n;x++) {
//		cows.get(i);
//		if (cows.get(i).equals(in.get(x).get(0))) {
//			moo++;
//		}
//		System.out.println(cows.get(i)+"  "+in.get(x).get(0)+"   "+in.get(x).get(1));
//}
//		System.out.println(moo);
//
//}
//
