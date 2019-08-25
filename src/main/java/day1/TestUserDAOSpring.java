package day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDAOSpring {
    public static void main(String[] args) {
        //启动工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("day1/spring.xml");
        //获取组件对象
        //参数1:获取组件对象的唯一标识
        UserDAO userDAO = (UserDAO) context.getBean("userDAO");
        userDAO.save("小明");

    }
}
