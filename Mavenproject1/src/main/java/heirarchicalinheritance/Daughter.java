package heirarchicalinheritance;

public class Daughter extends Father {
	public void sub(int a, int b) {
		int sub=a-b;
		System.out.println(sub);
	}
	

	public static void main(String[] args) {
		Daughter obj2=new Daughter();
		obj2.division(10, 5);
		obj2.sub(10, 5);
		

	}

}
