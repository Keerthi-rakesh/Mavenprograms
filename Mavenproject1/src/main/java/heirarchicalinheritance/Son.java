package heirarchicalinheritance;

public class Son extends Father{
	public void show() {
	System.out.println("Good Morning");
	}

	public static void main(String[] args) {
		
		Son obj1=new Son();
		obj1.division(12, 4);
		obj1.show();

	}

}
