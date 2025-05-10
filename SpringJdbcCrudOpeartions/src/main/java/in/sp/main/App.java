package in.sp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.bean.Student;
import in.sp.mappers.StudentRowMapper;
import in.sp.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        
//-------------Insert Operation---------------
      //        int  std_rollno = 132;//    	String std_name = "rukkjep";//    	float std_marks = 99.4f;//    	//        String insert_sql_query = "INSERT INTO student VALUES(?,?,?)";//       int count = jdbcTemplate.update(insert_sql_query , std_rollno,std_name,std_marks);//       if(count>0) {//    	   System.out.println("Insersion success.");//       }else {//    	   System.out.println("insersion failed.");//       }
//       
//------------- Update Operation----------   
//        float marks=98.3f;
//        int rollno=191;
//        
//       String update_sql_query = "UPDATE student set std_marks=? WHERE std_rollno=?";
//       int count = jdbcTemplate.update(update_sql_query,marks,rollno);
//       if(count > 0) {
//    	   System.out.println("insersion success.");
//       }else {
//    	   System.out.println("insersion failed");
//       }
        
//------------- Delete Operation----------        
        
//        int rollno=101;
//        
//       String delete_sql_query = "DELETE FROM student WHERE std_rollno=?";
//       int count = jdbcTemplate.update(delete_sql_query,rollno);
//       if(count > 0) {
//    	   System.out.println("deletion success.");
//       }else {
//    	   System.out.println("deletion failed");
//       }
       
////-----------SELECT OPERATION 1---------
//       String select_sql_query="SELECT * FROM student";
//      List<Student> std_list= jdbcTemplate.query(select_sql_query,new StudentRowMapper());
//       for(Student std : std_list)
//       {
//    	   System.out.println("rollno : "+ std.getRollno());
//    	   System.out.println("name : "+std.getName());
//    	   System.out.println("marks : "+std.getMarks());
//    	   System.out.println("------------------------------");
//       }
        
      //-----------SELECT OPERATION 2---------
        int rollno = 101;
        String select_sql_query="SELECT * FROM student where std_rollno=?";
       List<Student> std_list= jdbcTemplate.query(select_sql_query,new StudentRowMapper(),rollno);
        for(Student std : std_list)
        {
     	   System.out.println("rollno : "+ std.getRollno());
     	   System.out.println("name : "+std.getName());
     	   System.out.println("marks : "+std.getMarks());
     	   System.out.println("------------------------------");
        }
    }
}
