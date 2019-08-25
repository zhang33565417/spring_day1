package setdi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        //启动工厂
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("setdi/spring.xml");

        ClazzDAO clazzDAO = (ClazzDAO) context.getBean("clazzDAO");

        clazzDAO.save();

    }
}
