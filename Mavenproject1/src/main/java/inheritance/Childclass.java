package inheritance;

public class Childclass extends Parentclass {
	

	public static void main(String[] args) {
		
		Childclass obj1=new Childclass();
		obj1.display("Hello");
		obj1.instmeth(10,20);

	}
	public void display(String a) {
		System.out.println(a);
	}
	}


