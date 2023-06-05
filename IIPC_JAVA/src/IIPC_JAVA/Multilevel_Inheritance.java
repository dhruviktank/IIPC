package IIPC_JAVA;
/* Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. 
Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these
member--  employee -- manager */
public class Multilevel_Inheritance{
	public static void main(String args[]) {
		Manager m1 = new Manager();
		m1.Name = "John";
		m1.Salary = 2000;
		m1.Phone = "9932123222";
		m1.Address = "123, Street 9";
		m1.Designation = "Manager";
		m1.Department = "Production";
		m1.printSalary();
		//System.out.println("Name : "+m1.Name+"\nSalary : "+m1.Salary+"\nPhone : "+m1.Phone+"\nAddress : "+m1.Address+"\nDesignation : "+m1.Designation+"\nDepartment : "+m1.Department);
		System.out.println(m1);
	}
}
class Member {
	String Name;
	int Age;
	String Phone;
	String Address;
	int Salary;
	
	void printSalary() {
		System.out.println("Salary : "+Salary);
	}
}

class EmployeeMember extends Member{
	String Designation;
}
class Manager extends EmployeeMember{
	String Department;
	@Override
	public String toString() {
		return "Name : "+Name+"\nSalary : "+Salary+"\nPhone : "+Phone+"\nAddress : "+Address+"\nDesignation : "+Designation+"\nDepartment : "+Department;
	}
}

