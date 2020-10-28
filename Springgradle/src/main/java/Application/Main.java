package Application;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import model.Employee;
import service.EmployeeImpl;




public class Main {

	public static void main(String[] args) {
		int id=7;
		int id1=7;
		int id2=4;
		Employee employee = new Employee();
		
		employee.setEmp_name("Padhu");
		employee.setEmp_sal(8865);
		
		Employee employee1 = new Employee();
		employee1.setEmp_id(7);
		employee1.setEmp_name("Ani");
		employee1.setEmp_sal(9685);
		

	EmployeeImpl empimpl = new EmployeeImpl();
//	empimpl.save(employee);
	//empimpl.delete(id);
//empimpl.retrieve();
	//empimpl.retrieve(id1);
	empimpl.update(employee1);

	}

}
