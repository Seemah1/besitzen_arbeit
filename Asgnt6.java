//PROGRAM TO CHECK PRME NUMBER

package assignment1;

import java.util.*;

public class Asgnt6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 int flag = 0;
	     Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the value:");
	     int s=scan.nextInt();
	     int p=s/2;
	     for(int i=2;i<=p;i++)
	     {
	    	 if(s%i==0)
	    	 {
	    		 System.out.println(" number is not prime");
	    		 flag=1;
	    		 break;
	    	 }
	     }
	    	
			if(flag==0)
	    	 {
	    		System.out.println("number is prime"); 
	    	 }
	}
}


