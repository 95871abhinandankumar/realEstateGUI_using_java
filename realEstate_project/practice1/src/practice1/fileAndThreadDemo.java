package practice1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class Sum extends Thread
{
	double[][] arr;
	int row;
	
    Sum(double[][] arr, int row) {
		this.arr = arr;
		this.row = row;
	}
	public void run()
	{
		sum();
	}
	public void sum()
	{
		double temp = 0;
		for(int i = 0 ; i < arr[row].length ; i++) 
			temp = temp +   arr[row][i] ;
		
		System.out.println("Sum of all element of row - " + row + " is " + temp);
	}
}

public class fileAndThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String abc  = "";
         System.out.println("Enter the file name : ");
         Scanner sc = new Scanner(System.in);
         double arr[][];
         abc = sc.nextLine();
         File file = new File("C:\\Users\\abhinandan\\eclipse-workspace\\practice1\\src\\practice1\\" + abc);
         if(file.exists())
         {
        	 if(file.canRead())
        	 {
        		 try {
        			 
        		      BufferedReader br = new BufferedReader(new FileReader(file));
        		      try {
        		    	  String s1;
        		    	  String[] str = br.readLine().split(" ");
        		          arr = new double[Integer.parseInt(str[0])][Integer.parseInt(str[1])];
        		          
        		          for(int i = 0 ; i < arr.length ; i++)
        		          {
        		        	  s1 = br.readLine();
        		        	  str = s1.split(" ");
        		        	  
        		        	  for(int j = 0 ; j < arr[i].length ; j++)
        		        	  {
        		        		  arr[i][j] = Double.parseDouble(str[j]);
        		        	  }
        		        	  
        		          }
        		          
        		          for(int i = 0 ; i < arr.length ; i++)
        		          {
        		        	  Sum s = new Sum(arr, i);
        		        	  s.start();
        		        	  s.sleep(1000);
        		          }
        		          
        		      }catch(Exception e){}
        		      
        		      
        		 
        		 
        		 }catch(FileNotFoundException ex) {
        			 System.out.println(ex.getMessage());
        		 }
        	 }else {
        		 System.out.println("File is not readable!");
        	 }
         }
         else
         {
        	 System.out.println("File doesnot exit");
         }
         
		
	}

}
