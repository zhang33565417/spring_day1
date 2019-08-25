package autodi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autodi/spring.xml");
        DeptService deptService = (DeptService) context.getBean("deptService");

        deptService.delete();
    }
}
