package com.practice;
import java.io.*;
import java.util.*; 
public class word {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("word.in"));
      	StringTokenizer st = new StringTokenizer(br.readLine());
      	int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
		st= new StringTokenizer(br.readLine());
      	String[] text=new String[n];
      	for(int i=0;i<n;i++){
        	text[i]=st.nextToken();
        }
      	br.close();  
    	PrintWriter pw = new PrintWriter(new FileWriter("word.out"));
      	int i=0;
     	while(i<n){
          	pw.print(text[i]);
          	int lineLength=text[i].length();
            i++;

			while(i<n&&lineLength+text[i].length()<=k){

				pw.print(" "+text[i]);
              	lineLength+=text[i].length();
                i++;


            }

          pw.println();
        }

      	
      
      	
      
      pw.close();
	}

}
