//PROGRAM TO USE ENCAPSULATION AND INHERITANCE TOGETHER.

package assignment1;

import java.util.*;

public class Asgnt9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of queries:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        System.out.println("Enter number of week day:");
        int day = sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                 continue;
        }
      }
	}

}
