package br.ita.P2_CES29_Q3;

public class StudentController extends Controller{
	private Student model;
	private StudentView view;

	public StudentController(Student model, StudentView view) {
		super();
		this.model = model;
		this.view = view;
	}
	public void setName(String name) {
		model.setName(name);
	}

	public void setRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getName() {
		return model.getName();
	}

	public String getRollNo() {
		return model.getRollNo();
	}
	
	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}

}
