package exceptions;

public class Throws {

	public static void main(String[] args) throws AgeException{
		int age =17;
		if(age>=18) {
			System.out.println("Qualified");
			
		}else {
			throw new AgeException("Not Qualified");
		}
	}

}
