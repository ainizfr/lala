package test.com.zfr.course.c06;

        import com.zfr.course.c06.dao.UserDAO;
        import com.zfr.course.c06.model.User;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

        import java.util.List;

public class MyBatisTest {
    public static void main(String[] args){

        try {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config-mybatis.xml");
            /*UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
            User user = null;
            user = userDAO.findUserById(3);
            System.out.println(user);
            List<User> users= userDAO.findUserByName("张");


            for(User u:users){
                System.out.println(u);
            }*/
            UserDAO userDAO1 = (UserDAO) ctx.getBean("userDAO");
            User user1 = (User) ctx.getBean("user");


            user1.setName("张锋瑞");
            user1.setSex("00");
            user1.setEmail("zhangrui83@OUTLOOK.COM");

            userDAO1.addUser(user1);
            UserDAO userDAO2 = (UserDAO) ctx.getBean("userDAO");
            User user2 = (User) ctx.getBean("user");
            user2.setId(4);
            user2.setName("哈哈哈");
            user2.setSex("01");
            user2.setEmail("734826810@qq.com");
            userDAO2.updataUser(user2);
            UserDAO userDAO3 = (UserDAO) ctx.getBean("userDAO");
            userDAO3.deleteUser(1);

        } catch (Exception e) {
            e.printStackTrace();
        }



    }


}