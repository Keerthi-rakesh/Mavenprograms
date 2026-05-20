package exceptions;

public class MultipleExceptions {

	public static void main(String[] args) {
		try {
			int a[]=new int[2];
			a[2]=12/0;
					
		}
		
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("ArrayIndexBound Exception occurs");
		}
	/*	catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}*/
		catch(Exception s) {
			System.out.println(s);
		}
	}

}
