package studentsystem;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		//Declaring variables
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Welcome to Student Management system");
		System.out.println("Press 1. for create student\nPress 2. for get student by id\n"
				+ "Press 3. To update using Id\npress 4. to delete using id\nPress 5. to see all details\npress 6. to quit");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			StudentService.createStudent();
			
			System.out.println("=====================================");
			break;
			
		case 2:
			System.out.println("Enter id to search:");
			int id=sc.nextInt();
			try {
			StudentService.getStudentById(id);
			}catch(StudentNotFoundException sf)
			{
				System.out.println(sf.getMessage(id));
			}
			System.out.println("=====================================");
		
			break;
		case 3:
			System.out.println("Enter id to upddate:");
			int id1=sc.nextInt();
				
			try {
				StudentService.updateStudentUsingId(id1);
			} catch (StudentNotFoundException sf) 
			{
				System.out.println(sf.getMessage(id1));
			}
			break;
				
		case 4:
			System.out.println("Enter id to Delete student:");
			int id2=sc.nextInt();
			try {
				StudentService.deleteStudentUsingId(id2);
			} 
			catch (StudentNotFoundException sf) {
				System.out.println(sf.getMessage(id2));
				
			}
				break;
		case 5:
			StudentService.getAllStudents();
			break;
		case 6: break;
		}
		}while(choice!=6);
	}

}
