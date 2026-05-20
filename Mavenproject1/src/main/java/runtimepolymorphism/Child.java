package runtimepolymorphism;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.sum(23, 45);
		Parent obj1=new Child();
		obj1.sum(12, 15);

	}
	public void sum(int a, int b) {
		super.sum(10, 20);
		int sum=a+b;
		System.out.println(sum);
		
	}

}
