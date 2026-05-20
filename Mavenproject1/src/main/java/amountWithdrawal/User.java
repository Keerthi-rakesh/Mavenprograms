package amountWithdrawal;

public class User {

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.setPin("1111");
		obj.validatePin();
		obj.getPin();
	}
	

}
