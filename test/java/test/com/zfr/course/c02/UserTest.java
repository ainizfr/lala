package test.com.zfr.course.c02;

import com.zfr.course.c02.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.tools.java.ClassPath;

public class UserTest {
    public static void  main(String[] args){
        ClassPathXmlApplicationContext zfr=new ClassPathXmlApplicationContext("spring-config.xml");
        User user =(User) zfr.getBean("user");
       // User user1 =(User) zfr.getBean("sex");
        System.out.println(user.getName());
        System.out.println(user.getSex());
    }
}
