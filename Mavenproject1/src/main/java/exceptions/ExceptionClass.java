package exceptions;

public class ExceptionClass {

	public static void main(String[] args) {
		try {
		int a=12/0;
		System.out.println(a);
		
		}
		/*catch(ArithmeticException e) {
			System.out.println(e);
		}*/
		finally {
			System.out.println("Hello");
		}

	}

}
