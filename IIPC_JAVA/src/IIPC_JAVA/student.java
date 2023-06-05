package IIPC_JAVA;
// program 4
public class student extends student_info{
	public static void main(String[] args) {
		student s = new student();
		s.setAge(30);
		System.out.println(s.getAge());
		student_info s1 = new student_info();
		s1.setName("Rohit");
		s1.setAge(25);
		System.out.println(s1);
	}
}
