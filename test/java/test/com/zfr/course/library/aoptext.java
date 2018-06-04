package test.com.zfr.course.library;



import com.zfr.course.library.UserXML;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aoptext {
    public static void main(String[] args){
        ApplicationContext aop = new ClassPathXmlApplicationContext("spring-config-library.xml");
        UserXML userXML=(UserXML) aop.getBean("userxml") ;
       userXML.queryUser();
        //myUser.queryUser();

    }
}
