package Sagar_Sir_HW;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Student {

	ArrayList<String> m1() {

		StudentPOJO studInfo1 = new StudentPOJO();

		studInfo1.setStudName("Pallavi");
		studInfo1.setSub("Math");
		studInfo1.setStudeMarks(69);

		StudentPOJO studInfo2 = new StudentPOJO();

		studInfo2.setStudName("Purvi");
		studInfo2.setSub("Science");
		studInfo2.setStudeMarks(96);

		StudentPOJO studInfo3 = new StudentPOJO();

		studInfo3.setStudName("Nandini");
		studInfo3.setSub("Bio");
		studInfo3.setStudeMarks(100);

//Add student Info in the ArrayList
		ArrayList<StudentPOJO> AL = new ArrayList<>();

		AL.add(studInfo1);
		AL.add(studInfo2);
		AL.add(studInfo3);

		ArrayList<String> studName = new ArrayList<>();
		for (StudentPOJO studentPOJO : AL) {

			String name = studentPOJO.getStudName();
			studName.add(name);
		}

		return studName;
	}

}
