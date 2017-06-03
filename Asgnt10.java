

package assignment1;

public class Asgnt10 {
	
			void marks(){
				System.out.println("Marks in class Asgnt10");
			}
		    void salary(){
		    	System.out.println("Salary in class Asgnt10");
		    }
		}

		public class Asgnt10a extends Asgnt10{
			
		    void salary(){
		    	System.out.println("Salary in class Test10");
		    }

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Asgnt10a t=new Asgnt10a();
		       t.marks();
		       t.salary();
			}

}
