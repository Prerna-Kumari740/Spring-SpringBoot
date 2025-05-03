package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.student;

public class Main {
	public static void main(String[] args) {
		String resource_file_path = "in/sp/resources/applicationContext.xml";
		ApplicationContext context =new ClassPathXmlApplicationContext(resource_file_path);
		student std =(student) context.getBean("student");
		std.display();
	}

}
