package demo.designPattern.observer;

import java.util.Vector;

public class mainClient {

	public static void main(String[] args) {
		
		Vector<StudentObserver> students = new  Vector<StudentObserver>();
		teacherSubject teacher = new  teacherSubject();
		for (int i = 0 ;i<10;i++)
		{
			StudentObserver st = new StudentObserver("lili"+i, teacher);
			students.add(st);
			teacher.attach(st);
		}
		
		teacher.setPhone("888888888");
		for(int i = 0;i<10;i++)
		{
			((StudentObserver)students.get(i)).show();
		}
		
		teacher.setPhone("999999999");
		for(int i = 0;i<10;i++)
		{
			((StudentObserver)students.get(i)).show();
		}
		
	}
}
