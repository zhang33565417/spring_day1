package day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCityServiceSpring {
    public static void main(String[] args) {
        //启动工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("day1/spring.xml");

        //获取cityService组件对象
        CityService cityService = (CityService) context.getBean("cityService");

        cityService.save("天津");


    }
}
