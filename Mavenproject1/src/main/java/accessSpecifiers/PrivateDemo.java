package accessSpecifiers;

public class PrivateDemo {

	public static void main(String[] args) {
		PrivateDemo obj=new PrivateDemo();
		obj.display("Hello");

	}
	private void display(String a) {
		System.out.println(a);
		System.out.println("Java Program");
	}

}
