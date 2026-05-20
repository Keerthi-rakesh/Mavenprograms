package employeesalary;
import java.util.Scanner;

public class Employee {
String name;
int id;
double basepay;
double deduction; 
double bonus;
double hra;
double pf;
double totalsalary;

public void getDetails() {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter Name: ");
    name=sc.nextLine();
    System.out.println("Enter Id: ");
    id=sc.nextInt();
    System.out.println("Enter Basic Pay: ");
    basepay=sc.nextDouble();
    System.out.println("Enter Deduction: ");
    deduction=sc.nextDouble();
    System.out.println("Enter Bonus:");
    bonus=sc.nextDouble();
}
public void displayBasicInfo() {
	System.out.println("ID: "+id+ ", Name: "+name+ ", Base Pay: "+basepay+ ", Deduction: "+deduction+", Bonus: "+bonus);
}
}
