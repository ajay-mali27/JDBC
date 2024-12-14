package ImpProg;

import java.util.ArrayList;

public class Empmain {

	ArrayList<Employee> employeeData() {
		
		Employee e1 = new Employee();
		
		e1.setEmpID(1);
		e1.setEmpName("John");
		e1.setEmpSal(6600);

		Employee e2 = new Employee();
		e2.setEmpID(2);
		e2.setEmpName("Sam Altman");
		e2.setEmpSal(5854);

		Employee e3 = new Employee();
		e3.setEmpID(3);
		e3.setEmpName("Harry");
		e3.setEmpSal(56975);

		ArrayList<Employee> AL = new ArrayList<Employee>();

		AL.add(e1);
		AL.add(e2);
		AL.add(e3);

		
		return AL;
	}

	
}
