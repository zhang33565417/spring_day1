package cdi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cdi/spring.xml");
        EmpDAO empDAO = (EmpDAO) context.getBean("empDAO");

        empDAO.delete();


    }
}
