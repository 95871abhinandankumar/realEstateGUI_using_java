package practice1;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(reader.readLine());
		
		while(t > 0)
		{
		    int n = Integer.parseInt(reader.readLine());
		    
		    String str = reader.readLine();
		    String s[] = str.trim().split(" ");
		    HashMap<Integer, String> h = new HashMap<Integer, String>();
		    

		    
		    char c = s[0].charAt(0);
		    
		    
		    Map<String , ArrayList<Character>> multiMap = new HashMap<>();
		    int key = 0;
		    for(int i = 0 ; i < n ; i++)
		    {
		      
		        
		        
		        if(!multiMap.containsKey(s[i].substring(1)))
		        {
		        	h.put(key++, s[i].substring(1));
		        	ArrayList<Character> ar = new ArrayList<>();
		        	ar.add(s[i].charAt(0));
		        	multiMap.put(s[i].substring(1), ar);
		        	
		        }else {
		        	multiMap.get(s[i].substring(1)).add(s[i].charAt(0));
		        }
		        
		        
		        
		    }
		    
		    
		    
             	    int count = 0;
        		    
        		    for(int i = 0 ; i < h.size() ; i++)
        		    {
        		        for(int j = i+1 ; j < h.size() ; j++)
        		        {
        		        		ArrayList<Character> arr1 = multiMap.get(h.get(i));
        		        		ArrayList<Character> arr2 = multiMap.get(h.get(j));
        		        		int common = 0;
        		        		for(int p = 0 ; p < arr1.size(); p++)
        		        		{
        		        			for(int q = 0 ; q < arr2.size(); q++)
        		        			{
        		        				if(arr1.get(p) == arr2.get(q))
        		        				{
        		        					common++;
        		        				}
        		        			}
        		        		}
        		        		count = count + (arr1.size() - common) *(arr2.size()- common);
        		        		
        		            
        		        }
        		    }
        		    
		         System.out.println(2*count);
		
		
		    t--;
		}
		
		
	}
}
