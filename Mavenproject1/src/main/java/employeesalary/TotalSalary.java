package employeesalary;

public class TotalSalary extends Calculation{

	public static void main(String[] args) {
		TotalSalary obj=new TotalSalary();
		obj.getDetails();
		obj.displayBasicInfo();
		obj.calculate();
		obj.totalSalary();

	}
	public void totalSalary() {
	double totalsalary=basepay+hra-pf-deduction+bonus;
		System.out.println("Salary slip of the employee "+name+ " Basic Pay: "+basepay+ " Deduction "+deduction+ " HRA "+hra+ " PF: "+pf+ " Bonus: "+bonus+ " Total Salary: "+totalsalary);
	}

}
