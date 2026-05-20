package aggregation;

public class Aggregationdemo2 {
	int c;
	int d;
	Aggregationdemo1 obj; //Aggregation
	public Aggregationdemo2(int c, int d,Aggregationdemo1 obj) {
		this.c=c;
		this.d=d;
		this.obj=obj;
		
	}

	public static void main(String[] args) {
		
		Aggregationdemo1 obj1=new Aggregationdemo1();
		obj1.sum(10, 20);
		Aggregationdemo2 obj2=new Aggregationdemo2(30,40,obj1);
		obj2.print();
		

	}
	public void print() {
		System.out.println(c);
		System.out.println(d);
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
	

}
