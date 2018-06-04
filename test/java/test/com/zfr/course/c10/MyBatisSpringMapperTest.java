package test.com.zfr.course.c10;

import com.zfr.course.c10.user.model.User;
import com.zfr.course.c10.user.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisSpringMapperTest {
    public static void main(String[] args){
    try {
        ApplicationContext zfr = new ClassPathXmlApplicationContext("mybatis-config-spring.xml");
        UserService userService =(UserService)zfr.getBean(UserService.class);
        User user =userService.findUserById(1);
        System.out.println(user);
    }catch (Exception e){
        e.printStackTrace();
    }

    }
}
