package discount;

public class Offseason extends Onseason {

	public static void main(String[] args) {
		Offseason obj=new Offseason();
		obj.discount();
		

	}
	public void discount() {
		super.discount();
		int i = super.total;
		double discount=i*0.15;
		System.out.println(discount);
		
	}

}
