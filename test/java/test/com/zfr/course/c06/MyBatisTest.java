package test.com.zfr.course.c06;

        import com.zfr.course.c06.dao.UserDAO;
        import com.zfr.course.c06.model.User;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisTest {
    public static void main(String[] args){

        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-mybatis.xml");
            UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
            User user = null;
            user = userDAO.findUserById(3);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }


}