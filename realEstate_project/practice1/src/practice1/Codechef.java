/* package codechef; // don't place package name! */
package practice1;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		

		
		
	
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(reader.readLine());
		while(t > 0)
		{
		    String str = reader.readLine();
		    int time[] = new int[2];
		    
		    time[0] = Integer.parseInt(str.substring(0, 2));
		    time[1] = Integer.parseInt(str.substring(3, 5));
		    
		    if(str.substring(6, 8).equals("PM") && time[0] < 12)
		    {
		        time[0] += 12;
		        
		    }
		    if(str.substring(6, 8).equals("AM") && time[0] == 12)
		    {
		        time[0] = 0;
		        
		    }
		    
		    
		    int time1[] = new int[2];
		    int time2[] = new int[2];
		    
		    int n = Integer.parseInt(reader.readLine());
		    
		    String ans = "";
		    for(int i = 0 ; i < n ; i++)
		    {
		        String str1 = reader.readLine();
		     
		         time1[0] = Integer.parseInt(str1.substring(0, 2));
		         time1[1] = Integer.parseInt(str1.substring(3, 5));
		    
		         if(str1.substring(6, 8).equals("PM") && time1[0] < 12)
				    {
				        time1[0] += 12;
				        
				    }
				    if(str1.substring(6, 8).equals("AM") && time1[0] == 12)
				    {
				        time1[0] = (time1[0] + 12) % 24;
				        
				    } 
		           
		           
		           time2[0] = Integer.parseInt(str1.substring(9, 11));
		           time2[1] = Integer.parseInt(str1.substring(12, 14));
		    
		           if(str1.substring(15, 17).equals("PM") && time2[0] < 12)
				    {
				        time2[0] += 12;
				        
				    }
				    if(str1.substring(15, 17).equals("AM") && time2[0] == 12)
				    {
				        time2[0] = (time2[0] + 12) % 24;
				        
				    } 
		           
		           
		           if(time[0] > time1[0] && time[0] < time2[0])
		           {
		               
		                    System.out.print(1);
		           }else if(time[0] > time1[0] && time[0] == time2[0])
		           {
		               if(time[1] <= time2[1])
		                    System.out.print(1);
		                else 
		                    System.out.print(0);
		           }else if(time[0] == time1[0] && time[0] < time2[0])
		           {
		               if(time[1] >= time1[1])
		                    System.out.print(1);
		                else 
		                    System.out.print(0);
		           }else if(time[0] == time1[0] && time[0] == time2[0])
		           {
		               if(time[1] >= time1[1] && time[1] <= time2[1])
		                    System.out.print(1);
		                else 
		                    System.out.print(0);
		               
		           }else{
		               System.out.print(0);
		           }
		          
		           
		    }
		    
		    System.out.println();
		    
		    
		    
		    t--;
		}
		
		
		
	}
}

