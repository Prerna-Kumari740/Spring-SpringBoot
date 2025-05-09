package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj1() {
		Address adr = new Address();
		adr.setHouseno(123);
		adr.setCity("delhi");
		adr.setPincode(123456);
		return adr;
	}
	@Bean
	public Address createAddrObj2() {
		Address adr = new Address();
		adr.setHouseno(183);
		adr.setCity("dili");
		adr.setPincode(123496);
		return adr;
	}
	@Bean
	public Student CreateStdObj() {
		Student std=new Student();
		std.setName("deep");
		std.setRollno(123);
//		std.setAddress(createAddrObj()); //Manually DI
		return std;
	}
}
