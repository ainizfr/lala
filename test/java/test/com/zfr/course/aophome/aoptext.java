package test.com.zfr.course.aophome;

import com.zfr.course.aophome.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aoptext {
    public static  void main(String[] args){
        ApplicationContext aop=new ClassPathXmlApplicationContext("spring-config-aophome.xml");
        User user=(User) aop.getBean("user");
        user.queryUser();


    }
}
