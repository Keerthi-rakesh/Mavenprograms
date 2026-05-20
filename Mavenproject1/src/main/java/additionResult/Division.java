package additionResult;

public class Division extends Addition {

	public static void main(String[] args) {
		Division obj=new Division();
		obj.result();
	}
	public void result() {
		super.sum(56, 20);
		int result=sum%10;
		if(result==0) {
			System.out.println(sum + " is divisible by 10");
			
			
		}else {
			System.out.println(sum + " is not divisible by 10");
		}
		
	}

}
