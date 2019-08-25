package di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("di/spring.xml");
         StudentService studentService = (StudentService) context.getBean("studentService");
         studentService.save("小张");
    }
}
