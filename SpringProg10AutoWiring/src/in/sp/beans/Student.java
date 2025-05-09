package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String name;
	private int rollno;

	@Autowired
	private Address address;
	@Autowired
	private Subject subject;

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

	public void display() {
		System.out.println("rollno :" + rollno);
		System.out.println("name :" + name);
		System.out.println("Address :" + address);
		System.out.println("Subject :" + subject);
	}
}