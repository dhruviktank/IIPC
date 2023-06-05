package IIPC_JAVA;
/*Create an abstract class called Animal with the following properties and methods:

Properties:
name (String)
age (int)
Methods:
abstract void makeSound(): This method should be implemented by each subclass of Animal and should print the sound made by the specific animal.
Create two subclasses of Animal called Dog and Cat. Implement the makeSound() method in each subclass to print the sound made by a dog and a cat, respectively.

In the Main class, create instances of Dog and Cat,
set their name and age properties, and call the makeSound() method for each instance.

Write the code to solve the problem. */
public class Animal_Demo {
	public static void main(String args[]) {
		Dog d1 = new Dog();
		d1.makeSound();
		Cat c1 = new Cat();
		c1.makeSound();
	}
}
abstract class Animal{
	String name;
	int age;
	abstract void makeSound();
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Bark");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Meow");
	}
}