//PROGRAM TO REVERSE A NUMBER

package assignment1;

public class Asgnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=279, reverse=0,s;
		while(num>0)
		{
			s=num%10;
			reverse=reverse*10+s;
			num=num/10;
		}
		System.out.println("the reverse of the chosen number is:"+reverse);
	}

}
