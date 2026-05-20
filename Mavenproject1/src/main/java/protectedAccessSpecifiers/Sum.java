package protectedAccessSpecifiers;

public class Sum {

	public static void main(String[] args) {
		Sum obj =new Sum();
		obj.add(10, 20);

	}
	protected void add(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}

}
