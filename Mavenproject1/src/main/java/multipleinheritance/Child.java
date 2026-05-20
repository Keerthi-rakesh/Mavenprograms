package multipleinheritance;

public class Child implements Parent, ParentClass{

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.print();
		obj.sum();

	}

	@Override
	public void sum() {
		System.out.println("World");
		
	}

	@Override
	public void display() {
		System.out.println("Hello");
		
	}
	
	public void print() {
		
		System.out.println("Sample text");
		
	}

}
