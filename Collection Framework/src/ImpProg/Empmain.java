package ImpProg;

import java.util.ArrayList;

public class Empmain {

	ArrayList<String> m1() {

		ArrayList<Employee> AL = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setEmpID(1);
		e1.setEmpName("AJAY");
		e1.setEmpSal(150);

		Employee e2 = new Employee();
		e2.setEmpID(2);
		e2.setEmpName("Rahul");
		e2.setEmpSal(562);

		AL.add(e1);
		AL.add(e2);

		ArrayList<String> AddempNameInAList = new ArrayList<String>();

		for (Employee employee : AL) {
			String name = employee.getEmpName();
			AddempNameInAList.add(name);
		}

		return AddempNameInAList;
	}

}
