package businessException;

public class EmployeeException extends Exception {
	public EmployeeException()
	{
		super("There is no record with such id in database ");
	}
}
