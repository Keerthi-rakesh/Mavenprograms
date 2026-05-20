package amountWithdrawal;

public class Bank {
	
	private String pin;
	
	public void setPin(String newpin) {
		this.pin=newpin;		
	}
	public void validatePin() {
		if(this.pin.matches("1001|1234|1212")) {
			System.out.println("Pin Set Successfully");
		}else {
			System.out.println("Invalid Pin");
		}
	}
	public String getPin() {
		return this.pin;
	}
	
		
				
}
			
		
		
	


