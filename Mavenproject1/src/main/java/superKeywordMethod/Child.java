package superKeywordMethod;

public class Child extends ParentClass {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display("World");
		obj.getparent();
		

	}
	public void display(String a) {
		//super.display("Hello");
		System.out.println(a);
	}
	public void getparent() {
		super.display("Java");
		display("Program");
	}

}
