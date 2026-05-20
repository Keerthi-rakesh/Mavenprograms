package studentDetails;

import java.util.Scanner;

public class Address {
	String address;
	Student obj;
	
	public Address(Student obj) {
		this.obj=obj;
		
	}

	public static void main(String[] args) {
		
		Student obj1=new Student();
		obj1.getDetails();
		
		Address obj2=new Address(obj1);
		obj2.print();
	}
	
	public void print() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student's Address");
		String address=sc.next();
		this.address=address;
		System.out.println("Student Name:" +obj.name);
		System.out.println("Student RollNo:"+obj.rollno);
		System.out.println("Student Address:" +address);
		
	}

}
