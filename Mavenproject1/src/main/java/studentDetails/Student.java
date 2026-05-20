package studentDetails;

import java.util.Scanner;

public class Student {
	String name;
	int rollno;
	
	
	public void getDetails() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student name");
		String name=sc.next();
		System.out.println("Enter the roll number");
		int rollno=sc.nextInt();
		this.name=name;
		this.rollno=rollno;
		
		
		
	}
	

}
