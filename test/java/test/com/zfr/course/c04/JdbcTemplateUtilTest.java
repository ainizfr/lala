package test.com.zfr.course.c04;

import com.zfr.course.c01.Student;
import com.zfr.course.c04.JdbcTemplateUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTemplateUtilTest {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-jdbc.xml");
        JdbcTemplateUtil jdbcTemplateUtil=(JdbcTemplateUtil) ctx.getBean("jdbcTemplateUtil");
        //jdbcTemplateUtil.createTable();
        Student student=(Student) ctx.getBean("student");
        student.setName("张锋瑞");
        student.setSex("男");
        student.setEmail("zhangrui83@outlook.com");
        jdbcTemplateUtil.addUser(student);
        Student student1=jdbcTemplateUtil.searchUser(1);
        System.out.println("id="+student1.getId()+" "+"name="+student1.getName()+" "+"Email"+student.getEmail());
        List<Student> list =jdbcTemplateUtil.findAll();
        System.out.println("所有用户数="+list.size());
        for(int i=0;i<list.size();i++){
            Student student2=(Student) list.get(i);
            System.out.println("id="+student2.getId()+" "+"name=" +student2.getName());
        }

    }
}
