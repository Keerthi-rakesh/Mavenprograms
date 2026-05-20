package superkeyword;

public class Child extends Parent {
	
	int a=20;

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();

	}
	public void display() {
		System.out.println(a);
		System.out.println(super.a);
	}

}
