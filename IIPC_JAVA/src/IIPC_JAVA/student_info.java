package IIPC_JAVA;

public class student_info {
	public String name = "Dhruvik";
	private int age = 20;
	
	public void setName(String val) {
		name = val;
	}
	public String getName() {
		return name;
	}
	public void setAge(int val) {
		age = val;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return ("Name : "+getName()+"\nAge : "+getAge());
	}
}