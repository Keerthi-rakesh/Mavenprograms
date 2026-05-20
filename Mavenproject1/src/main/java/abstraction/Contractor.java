package abstraction;

public class Contractor extends Employee {

	public static void main(String[] args) {
		Contractor obj=new Contractor();
		obj.calculateSalary(12.5, 5);

	}

	@Override
	public void calculateSalary(double paymentperhour, int workinghours) {
		double salary=paymentperhour*workinghours*30;
		System.out.println(salary);
		
	}

}
