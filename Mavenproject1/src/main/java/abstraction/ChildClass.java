package abstraction;

public class ChildClass implements ParentClass {

	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.display();
		obj.print();

	}

	@Override
	public void display() {
		System.out.println("World");
		
	}
	public void print() {
		System.out.println("Hello");
	}

}
