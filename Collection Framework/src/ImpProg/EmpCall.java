package ImpProg;

import java.util.ArrayList;

public class EmpCall {
	public static void main(String[] args) {

		Empmain emp = new Empmain();

		ArrayList<Employee> alll = emp.employeeData();

		System.out.println(alll);

		for (Object object : alll) {
			System.out.println(object);
		}



		
		
	}
}
