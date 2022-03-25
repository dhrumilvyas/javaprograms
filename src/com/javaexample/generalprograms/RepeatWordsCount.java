package com.javaexample.generalprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RepeatWordsCount {

	public static void main(String[] args) throws IOException {
		 FileReader f=new FileReader("TextFile");
	        BufferedReader b=new BufferedReader(f);
	        ArrayList <String> words=new ArrayList<String>();
	        String line, maxword="";
	        while((line=b.readLine())!=null)
	        {
	            String s[]=line.split(" ");
	            for(String t:s) words.add(t);   
	        }
	        int max=0;
	        for(int i=0;i<words.size();i++)
	        {
	            int count=1;
	            for(int j=i+1;j<words.size();j++)
	            {
	                if(words.get(i).equals(words.get(j))) count++;
	            }
	            if(count>max)
	            {
	                max=count;
	                maxword=words.get(i);
	            }
	        }
	        System.out.println("The highest occuring word is: "+maxword+". It occured "+max+" times.");

	}

}
