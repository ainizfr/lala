package test.com.zfr.course.c02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanAssembleTest {
    public static void main (String[] args){
        String xmlPath ="spring-config.xml";
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("user1"));
        System.out.println(applicationContext.getBean("user"));
    }
}
