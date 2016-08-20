package demo.designPattern.observer;

public class StudentObserver implements Observer {

	private String name;
	private String phone;
	private teacherSubject teacher;
	public StudentObserver(String name,teacherSubject t)
	{
		this.name = name;
		this.teacher = t;
	}
	
	public void show() {
		System.out.println("Name:" + this.name + "\nTeacher's phone: " + this.phone);
	}
	
	
	@Override
	public void update() {
	
		this.phone = this.teacher.getPhone();
	}

}
