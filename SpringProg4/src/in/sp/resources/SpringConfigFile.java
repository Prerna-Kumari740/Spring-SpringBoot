package in.sp.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan("in.sp.beans")
//@ComponentScan({"in.sp.beans"})//  this type of scan is used for multiple bean object
@ComponentScan(basePackages={"in.sp.beans"})
public class SpringConfigFile {

}
