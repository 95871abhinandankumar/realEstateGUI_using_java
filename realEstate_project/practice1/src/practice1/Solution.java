package practice1;

import java.lang.*;
import java.util.*;
import java.io.*;


public class Solution{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	Scanner sc = new Scanner(System.in);
	
	int t = sc.nextInt();
	for(int i = 0 ; i < t ; i++)
	{
		int n = sc.nextInt();
		int k = sc.nextInt();
		//sc.nextLine();
		String s = sc.nextLine();
		
		String str = reader.readLine();
		 
		int count = 0;
		for(int j = 0 ; j < n/2 ; j++)
		{
			if(str.charAt(j) != str.charAt(n-j-1))
				count++;
		}
		System.out.printf("Case #%d: %d\n",i+1, Math.abs(count-k));
		
		
	}
	
	
		


	}

}
