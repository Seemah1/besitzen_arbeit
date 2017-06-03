//PROGRAM TO CALCULATE SUM OF DIGITS

package assignment1;

public class Asgnt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=143, s = 0,b;
		while(i>0)
		{
			b=i%10;
			s=s+b;
			i=i/10;
		}
		System.out.println(s);
	}

}
