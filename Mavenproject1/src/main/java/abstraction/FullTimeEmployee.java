package abstraction;

public class FullTimeEmployee extends Employee {

	public static void main(String[] args) {
		FullTimeEmployee obj=new FullTimeEmployee();
		obj.calculateSalary(15, 8);

	}

	@Override
	public void calculateSalary(double paymentperhour, int workinghours) {
		double salary=paymentperhour*workinghours*30;
		System.out.println(salary);
		
	}
	

}
