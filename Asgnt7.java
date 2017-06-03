//PROGRAM TO SHOW OVERLOADING AND OVERRIDING USING POLYMORPHISM AND INHERITANCE.

package assignment1;

public class Asgnt7{

	void cap(int a,int b){
		System.out.println("In method cap in class A "+(a+b));
	}
			
	void sap(int a,int b){
		System.out.println("In method sap in class A "+(a+b));
	}
}

public class Asgnt7a extends Asgnt7{
		  //Method overloading
	int tap(int a,int b){
		System.out.println("In method tap with int arguements");
		return a+b;
	}
			
	long tap(int a,long b){
		System.out.println("In method tap with long arguments");
		return a+b;
	}
	void cap(int a,int b){
		System.out.println("In method kkkk in class Test9 "+(a+b));
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      Asgnt7a t=new Asgnt7a();
		      System.out.println(t.tap(6,9));
		      System.out.println(t.tap(5,9l));
		      t.sap(5, 9);
		      t.cap(6,9);
	}

}

