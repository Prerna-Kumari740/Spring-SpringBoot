package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

//configuration allows us to define bean and their dependencies in java based 
@Configuration 
public class SpringConfigFile {
// it is used to declare as a method factory for creating and configuring a bean managed by the spring container
	@Bean
//method name become the default bean name and the return type of the method determine the class of the object that will be created as the bean 	
//this object is managed by bean and create by spring container	when the spring container is initializes it will invoke all the method to create the student object
	
	public Student stdId1()
	{
		Student std=new Student();
		std.setName("kamal");
		std.setRollno(102);
		std.setEmail("kamal@gmail.com");
		return std;
	}

}
