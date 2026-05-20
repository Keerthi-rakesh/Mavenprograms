package employeesalary;

public class Calculation extends Employee{
	public static void main(String args[]) {
		Calculation obj1=new Calculation();
		obj1.getDetails();
		obj1.calculate();
	}

	
	public void calculate() {
		 hra=basepay*(0.05);
		 pf=basepay*(0.20);
		System.out.println("Hra: "+hra+ ", Pf: "+pf);
	}

}
