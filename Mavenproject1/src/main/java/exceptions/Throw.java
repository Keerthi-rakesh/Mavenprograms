package exceptions;

public class Throw {

	public static void main(String[] args) {
		int age=16;
		if(age>=18) {
			System.out.println("Eligible");
			
		}else {
			throw new ArithmeticException("age under 18");
		}

	}

}
