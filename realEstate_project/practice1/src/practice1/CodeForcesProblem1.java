
package practice1;

import java.util.Scanner;
/* Ridbit starts with an integer n.

In one move, he can perform one of the following operations:

divide n by one of its proper divisors, or
subtract 1 from n if n is greater than 1.
A proper divisor is a divisor of a number, excluding itself. For example, 1, 2, 4, 5, and 10 are proper divisors of 20, but 20 itself is not.

What is the minimum number of moves Ridbit is required to make to reduce n to 1?

Input
The first line contains a single integer t (1≤t≤1000) — the number of test cases.

The only line of each test case contains a single integer n (1≤n≤109).

Output
For each test case, output the minimum number of moves required to reduce n to 1    */



public class CodeForcesProblem1 {
	
	public static int secondLargestFactor(int n)
	{
		for(int i = n/2 ; i > 1 ; i--)
		{
			if(n%i==0)
				return i;
		}
	    
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 0;
		int n;
		int count = 0;
		int factor;
		
		
		Scanner sc = new Scanner(System.in);
		
		t = sc.nextInt();
		
		while(t > 0)
		{
			n = sc.nextInt();
			
			if(n == 1 )
			 System.out.println(0);
			  else if( n == 2)
			    System.out.println(1);
			   else if(n == 3)
			    System.out.println(2);
			    else if(n %2 == 0)
			     System.out.println(2);
			     else
			      System.out.println(3);
			   
			t--;
		}
		

	}

}
