package compiletimepolymorphism;

public class Compiletime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compiletime obj=new Compiletime();
		obj.add(10,20);
		obj.add();
		obj.add("Hello");

	}
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
		
	}
	public void add(String a) {
		System.out.println(a);
		
	}
	public void add() {
		System.out.println("Java");
	}

}
