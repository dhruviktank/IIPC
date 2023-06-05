package IIPC_JAVA;
//Program 6
//Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
//Name        Year of joining        Address
//Robert            1994                64C- WallsStreat
//Sam                2000                68D- WallsStreat
//John                1999                26B- WallsStreat
public class employeeInfo {
	public static void main(String[] args) {
		int space = 15;
		Employee[] emp = new Employee[3];
		emp[0] = new Employee("Robert",1994,"64C- WallsStreat");
		emp[1] = new Employee("Sam",2000,"68D- WallsStreat");
		emp[2] = new Employee("John",1999,"26B- WallsStreat");
		String n = "Name",y = "Year of Joining",a = "Address";
		System.out.println(n + "       " + y + "         " + a);
		for(Employee x : emp) {
			System.out.print(x.empname);
			for(int i=0;i<(space-(x.empname).length());i++) {
				System.out.print(" ");
			}
			System.out.print(x.joiningyear);
			for(int i=0;i<(space-(Integer.toString(x.joiningyear)).length());i++) {
				System.out.print(" ");
			}
			System.out.print(x.address);
			System.out.println();
		}
	}
}
class Employee{
	String empname;
	int joiningyear;
	String address;
	Employee(String name, int year, String add){
		this.empname = name;
		this.joiningyear = year;
		this.address = add;
	}
}
