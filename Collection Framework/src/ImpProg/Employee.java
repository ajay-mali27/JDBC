package ImpProg;

public class Employee {

	private String EmpName;
	private int EmpID;
	private int EmpSal;

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int empID) {
		EmpID = empID;
	}

	public int getEmpSal() {
		return EmpSal;
	}

	public void setEmpSal(int empSal) {
		EmpSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpID=" + EmpID + ", EmpSal=" + EmpSal + "]";
	}

}
