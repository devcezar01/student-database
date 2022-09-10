package studendatabaseapp;

import java.util.Scanner;

public class studentDatabaseApp {

	public static void main(String[] args) {
		
	
		
		
		
		//perg novos stu
		System.out.println("number stud: ");
		Scanner in = new Scanner (System.in);
		int numOfStudents = in.nextInt();
		Student[] student = new Student[numOfStudents];
		
		//criar estudantes
		for (int n = 0; n < numOfStudents; n++) {			
			student[n] = new Student();
			student[n].enroll();
			student[n] .payTuitton();
			System.out.println(student[n].toString());
		}
		
		for (int n = 0; n < numOfStudents; n++) {			

			System.out.println(student[n].toString());
		}
		


	}

}
