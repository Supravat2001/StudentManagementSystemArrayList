package studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
//creating array student object type of
//	static Student student[]=new Student[10];
	static ArrayList<Student> student =new ArrayList<Student>();
	static Scanner sc=new Scanner(System.in);
//	static int index=0;
	//creating method to add students details
	public static void  createStudent()
	{
		//declaring variables
		int id;
		String name,address;
		//taking data from user
		System.out.println("enter stdent id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter stdent name:");
		name=sc.nextLine();
		
		System.out.println("enter stdent address:");
		address=sc.nextLine();
		student.add(new Student(id,name, address)) ; //adding data 
		System.out.println("Students has been added successfully");
	}
	//creating method to update students data using Id
	public static void  updateStudentUsingId(int id) throws StudentNotFoundException
	{
		//Declaring variables
		boolean status=false;
		for(int i=0;i<student.size();i++) {
			if(id==student.get(i).getStudentId()) //Checking entered id is matching or not
			{
		String name,address;
		//taking new students data from user
		System.out.println("enter new stdent id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter new stdent name:");
		name=sc.nextLine();
		
		System.out.println("Enter new stdent address:");
		address=sc.nextLine();
		student.set(i, new Student(id,name, address)); //updating data
		
		System.out.println("Students has been Updated successfully");
		status=true;
	}
		}
	 if(status==false) //if id not found exception will throw
	 {
		 //throw new StudentNotFoundException("student not found with id: "+ id);
		 throw new StudentNotFoundException();
	 }
		}
	//creating method to get student details using id
	public static void getStudentById(int id) throws StudentNotFoundException
	{
		boolean status=false;
		for(int i=0;i<student.size();i++)
		{
		if(id==student.get(i).getStudentId()) //Checking entered id is matching or not
		{
			//System.out.println(student[i]);
			//printing students data
			System.out.println("Student id: "+student.get(i).getStudentId());
			System.out.println("Student Name: "+student.get(i).getStudentName());
			System.out.println("Student Address: "+student.get(i).getAddress());
			status=true;
			
		}
		
		}
		if(status==false) //if id not found exception will throw
		{
			throw new StudentNotFoundException();
		}
		
		
	}
	//creating method to print all students data
	public static void getAllStudents() {
		//loop to print
		for(int i=0;i<student.size();i++) {
			
				System.out.println("Student id: "+student.get(i).getStudentId());
				System.out.println("Student Name: "+student.get(i).getStudentName());
				System.out.println("Student Address: "+student.get(i).getAddress());
			
			}
	}
	//creating method to delete data using id
	public static void deleteStudentUsingId(int id) throws StudentNotFoundException 
	{
		boolean status=false;
		for(int i=0;i<student.size();i++) 
		{
			if(id==student.get(i).getStudentId()) //Checking enter id is exist or not
			{
				student.remove(i); //Deleting data
				System.out.println("Student with ID "+id+" Is deleted succesfully");
				status=true;
			}
		}
		if(status==false) //if entered id not found
		{
			 throw new StudentNotFoundException(); //exception will throw
		 }
	}
}






