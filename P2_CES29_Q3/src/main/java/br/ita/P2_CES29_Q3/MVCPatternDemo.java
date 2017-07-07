package br.ita.P2_CES29_Q3;

public class MVCPatternDemo {
	public static void main(String[] args) {

		Student model1 = retriveStudentFromDatabase();
		Teacher model2 = retriveTeacherFromDatabase();
		
		StudentView view1 = new StudentView();
		TeacherView view2 = new TeacherView();
		
		Factory fc = new Factory();
		Controller controller1 = fc.buildController("student", model1, view1);
		Controller tcontroller = fc.buildController("teacher", model2, view2);
		
		controller1.updateView();
		controller1.setName("Thayza");
		controller1.updateView();
		
		tcontroller.updateView();
		tcontroller.setName("Leonardo");
		tcontroller.updateView();

	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Davi");
		student.setRollNo("10");
		return student;
	}
	
	private static Teacher retriveTeacherFromDatabase() {
		Teacher teacher = new Teacher();
		teacher.setName("Barreto");
		teacher.setRollNo("02");
		return teacher;
	}

}
