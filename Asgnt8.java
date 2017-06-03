//PROGRAM TO SWAP TWO NUMBERS WITHOUT USING THIRD VARIABLE.

package assignment1;

public class Asgnt8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s = 12;
        int p = 53;
        System.out.println("Before swap:");
        System.out.println("s value: "+s);
        System.out.println("p value: "+p);
        s = s+p;
        p=s-p;
        s=s-p;
        System.out.println("After swap:");
        System.out.println("s value: "+s);
        System.out.println("p value: "+p);
	}

}
