package studendatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionsbalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
		

	
	// construtor com nome e ano
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Fresman\n2 - for sophmore\n3 - junior\n4 -Senior\n nter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
			
	
	}
	
	
	// gerar id
	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//cursos
	public void enroll() {
		do {
			
		
			System.out.print("enter course enroll : ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {		
			courses = courses + "\n" + course;
			tuitionsbalance = tuitionsbalance + costOfCourse;
			}
			else { 
				System.out.println("BREAK");
				break; 
				}
		}	while (1 != 0);
}
	//balanco
public void viewBalance() {
	System.out.println("balance is: $" + tuitionsbalance);
}
	
	//pagamenti
public void payTuitton() {
	viewBalance();
	System.out.println("enter payment: $");
	Scanner in = new Scanner(System.in);
	int payment = in.nextInt();
	tuitionsbalance = tuitionsbalance - payment;
System.out.println("tks $" + payment);
viewBalance();
}
	//status
public String tpString() {
	return "name: " + firstName + " " + lastName + 
			"\nCourses enrolled: " + courses +
			"\nBallance: $" + tuitionsbalance;
}}


