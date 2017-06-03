//PROGRAM TO SHOW MULTIPLE INHERITANCE

package assignment1;

interface A {
	void show();

}
interface B
{
	void display();
}
interface c extends A,B
{
	void hide();
}
 class New3 implements c
{

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("first");
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("second");
	}

	public void hide() {
		// TODO Auto-generated method stub
		System.out.println("third");
	}
		public static void main(String[] args) 
		{
		 c n1=new New3();
		n1.show();
		n1.display();
		n1.hide();
		}
	}