package demo.designPattern.observer;

import java.util.Vector;

import javax.lang.model.element.VariableElement;

public class teacherSubject implements Subject {
	
	
	private String phone;
	private Vector students;
	
	public teacherSubject(){
		this.phone = "";
		this.students = new Vector();
	}

	@Override
	public void attach(Observer o) {
		students.add(o);
		
	}

	@Override
	public void detach(Observer o) {
		students.remove(o);
		
	}

	@Override
	public void notic() {
		for(int i = 0;i<students.size();i++)
		{
			((Observer)students.get(i)).update();
		}
		
	}
	
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String  getPhone() {
		return this.phone;
	}
	
	
	
}
