package multilevelinheritance;

public class Son extends Father {

	public static void main(String[] args) {
		Son obj=new Son();
		obj.sum(30, 40);
		obj.multiply(5, 8);
		obj.display("Hi");

	}
	public void display(String a) {
		System.out.println(a);
	}

}
