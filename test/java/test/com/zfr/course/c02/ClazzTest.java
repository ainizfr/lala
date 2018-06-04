package test.com.zfr.course.c02;

import com.zfr.course.c02.Clazz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClazzTest {
    public  static void  main(String[] args) {


        //1、
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        //2、
        Clazz clazz = (Clazz) ac.getBean("clazz");
        //3、
        System.out.println(clazz.toString());
    }
}
