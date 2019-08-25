package scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {



        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scope/spring.xml");
       PersonDAO personDAO = (PersonDAO) context.getBean("personDAO");
       context.close();//工厂正常的关闭
        /* PersonDAO personDAO1 = (PersonDAO) context.getBean("personDAO");
        System.out.println(personDAO);
        System.out.println(personDAO1);
        System.out.println(personDAO == personDAO1);*/


       //工厂原理:  xml解析技术 + 反射 + 类中构造方法   //工厂中对象存储模型 Map<String,Object> map
        /*PersonDAO o = (PersonDAO) Class.forName("scope.PersonDAOImpl").newInstance();
        o.save("小明");
        System.out.println(o);*/

       //工厂的生命周期: 只得是工厂中的组件对象什么时候创建 什么时候销毁
            //工厂启动工厂中所有单例bean随之创建,工厂正常关闭工厂中所有单例bean随之销毁
            //对于工厂中多例bean在每次使用时随之创建,spring工厂不负责多例bean的销毁

    }
}
