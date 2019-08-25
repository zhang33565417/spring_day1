package cdi;

import java.util.List;
import java.util.Map;

//构造注入: 使用构造方法的形式为类中成员变量赋值
public class EmpDAOImpl implements EmpDAO {

    private String name;
    private Integer age;
    private List<String> qqs;
    private Map<String,String> maps;
    private EmpDAO empDAO;


    public EmpDAOImpl(String name, Integer age, List<String> qqs, Map<String, String> maps, EmpDAO empDAO) {
        this.name = name;
        this.age = age;
        this.qqs = qqs;
        this.maps = maps;
        this.empDAO = empDAO;
    }

    public EmpDAOImpl(String name, Integer age, List<String> qqs, Map<String, String> maps) {
        this.name = name;
        this.age = age;
        this.qqs = qqs;
        this.maps = maps;
    }

    public EmpDAOImpl() {
    }

    public EmpDAOImpl(String name) {
        this.name = name;
    }

    public EmpDAOImpl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public EmpDAOImpl(Integer age) {
        this.age = age;
    }

    public EmpDAOImpl(String name, Integer age, List<String> qqs) {
        this.name = name;
        this.age = age;
        this.qqs = qqs;
    }

    @Override
    public void delete() {
        System.out.println("empDAO!!!");
        System.out.println("姓名: "+name);
        System.out.println("年龄: "+age);
        System.out.println("遍历list: ");
        qqs.forEach(qq -> System.out.println(qq));
        System.out.println("遍历map:");
        maps.forEach((k,v) -> System.out.println(k+":   "+v));
        System.out.println(empDAO);
    }
}
