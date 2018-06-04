package test.com.zfr.course.c01;

import com.zfr.course.c01.Student;
import com.zfr.course.c01.school;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StudentTest {
    public static void main (String[] args){
        //初始化容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        //通过容器获取bean 对象
        Student s = (Student) ac.getBean("student");
        s.setId(1511207);
        s.setName("张锋瑞");
        //使用对象
        System.out.println(s.toString());


        school sc=(school)ac.getBean("school");
        List<Student> list =sc.getStudentList();
        for(Student st:list){
            System.out.println();
            System.out.println(st.toString());
        }


    }
}

