package test.com.zfr.course.c03;

import com.zfr.course.c03.UserXML;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspecJXMLTest {
    public static void main(String[] args){
        ApplicationContext zfr = new ClassPathXmlApplicationContext("spring-config-aop.xml");
        UserXML user = (UserXML) zfr.getBean("userxml");
        user.queryUser();
    }
}
