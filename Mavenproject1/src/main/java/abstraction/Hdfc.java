package abstraction;

public class Hdfc implements Rbi{

	public static void main(String[] args) {
		Hdfc obj=new Hdfc();
		obj.recurringDeposit(10000, 12);

	}

	@Override
	public void recurringDeposit(double monthlyinstallment, int durationinmonths) {
		
		double interest=monthlyinstallment*((durationinmonths*(durationinmonths+1))/2.0)*(rateofinterest/100.0)*(1/12.0);
		double maturityamount=(monthlyinstallment*durationinmonths)+interest;
		System.out.println(interest);
		System.out.println(maturityamount);
		
	}

}
