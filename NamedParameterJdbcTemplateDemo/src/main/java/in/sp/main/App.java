package in.sp.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		NamedParameterJdbcTemplate npJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("std_rollno", 9);
		map.put("std_name", "hehl");
		map.put("std_marks", 11.7f);

		String insert_sql_query = "INSERT INTO student VALUES(:std_rollno,:std_name,:std_marks)";

		int count = npJdbcTemplate.update(insert_sql_query, map);
		if (count > 0) {
			System.out.println("insersion success");
		} else {
			System.out.println("insersion failed");
		}

	}
}
