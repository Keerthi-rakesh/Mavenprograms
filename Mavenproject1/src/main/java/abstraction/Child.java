package abstraction;

public class Child extends Parent{

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.print("World");
		obj.sum(10, 20);

	}

	@Override
	public void display() {
		System.out.println("Hello");
	}
	public void sum(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
		
	}

}
