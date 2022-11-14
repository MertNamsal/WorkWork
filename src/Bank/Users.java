package Bank;

import java.util.Scanner;

public class Users {
	private String name;
	private String lastName;
	private int age;
	private long id;
	private int year;
	private int educationStatus;
	private int salary;
	Scanner scan = new Scanner(System.in);
	
	
	public Users(String name, String lastName, long id, int bornYear, int salary) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.year = bornYear;
		System.out.println("What's your education level ?\n1-Primary School\n2-High School\n3-University\n4-Student");
		int answer = scan.nextInt();
		
		this.educationStatus = answer;
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getEducationStatus() {
		return educationStatus;
	}
	public void setEducationStatus(int educationStatus) {
		this.educationStatus = educationStatus;
	}
	
	
}
