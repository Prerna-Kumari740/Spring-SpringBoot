package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// whenever use  annotation we have to use java file or xml file

@Component //(1) it is used to declare a class as a spring beans which is managed component in the spring application context its helps spring automatically detect and managed these beans during application startup making them available for dependencies injection and other spring features (2) is is also known as stereotype annotation @service @Repository @Controller etc are part of @Component
public class Student {
	@Value("deep")
	private String name;
	@Value("108")
	private int rollno;
	@Value("87.9f")
	private float marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void display()
	{
		System.out.println("name "+name);
		System.out.println("rollno "+rollno);
		System.out.println("marks "+marks);
	}

}
