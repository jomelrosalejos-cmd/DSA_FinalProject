package project;

public class Person {
	
	private final String firstName;
	private final String lastName;
	private final int age;
	private final String sex;
	private double height;
	private double weight;
	
	Person(String firstName, String lastName, String sex,  int age, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
}
