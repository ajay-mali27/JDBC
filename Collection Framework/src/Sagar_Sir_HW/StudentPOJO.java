package Sagar_Sir_HW;

public class StudentPOJO {
	private String StudName;
	private String Sub;
	private int StudeMarks;

	public String getStudName() {
		return StudName;
	}

	public void setStudName(String studName) {
		StudName = studName;
	}

	public String getSub() {
		return Sub;
	}

	public void setSub(String sub) {
		Sub = sub;
	}

	public int getStudeMarks() {
		return StudeMarks;
	}

	public void setStudeMarks(int studeMarks) {
		StudeMarks = studeMarks;
	}

	@Override
	public String toString() {
		return "StudentPOJO [StudName=" + StudName + ", Sub=" + Sub + ", StudeMarks=" + StudeMarks + "]";
	}

}
