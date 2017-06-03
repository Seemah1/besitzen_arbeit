//PROGRAM TO PRINT FIBONACCI SERIES

package assignment1;

import java.util.*;

public class Asgnt5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p=0,q=1,r = 0;
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter n value:");
	    int n=scan.nextInt();
	    System.out.println(p);
	    System.out.println(q);

	    for(int i=2;i<n;++i)
	    	{
	    	  r=p+q;
	    	  System.out.println(r);
	    	  p=q;
	    	  q=r;
	    	}
	}

}
