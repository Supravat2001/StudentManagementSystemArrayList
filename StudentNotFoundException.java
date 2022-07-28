package studentsystem;

public class StudentNotFoundException extends Exception{
//public StudentNotFoundException(String message)
//{
//super(message);	
//}
	public String getMessage(int id)
	{
		return "student Not found with id "+id;
	}
}
