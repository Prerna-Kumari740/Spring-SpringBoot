package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address CreateAddrObj() {
		Address addr = new Address();
		addr.setHouseno(123);
		addr.setCity("delhi");
		addr.setPincode(123456);
		return addr;
	}
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		std.setRollno(101);
		std.setName("deep");
		std.setAddress(CreateAddrObj());
		return std;
	}

}
