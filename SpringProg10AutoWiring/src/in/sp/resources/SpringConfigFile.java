package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subject;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj() {
		Address adr = new Address();
		adr.setHouseno(123);
		adr.setCity("delhi");
		adr.setPincode(123456);
		return adr;
	}
	@Bean
	public Student CreateStdObj() {
		Student std=new Student();
		std.setName("deep");
		std.setRollno(123);
//		std.setAddress(createAddrObj()); //Manually DI
//		std.setSubject(CreateSubObj()); //Manually DI
		return std;
	}
	@Bean
	public Subject CreateSubObj() {
		Subject sub = new Subject();
		List<String> subject_list=new ArrayList<String>();
		subject_list.add("java");
		subject_list.add("Pyhton");
		subject_list.add("c++");
		subject_list.add("Springboot");
		sub.setSubject(subject_list);
		return sub;
	}
}
