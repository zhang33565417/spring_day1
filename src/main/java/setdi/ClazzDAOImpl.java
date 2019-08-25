package setdi;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ClazzDAOImpl implements ClazzDAO {

    private String name;
    private Integer age;
    private Double price;
    private Boolean sex;
    private float salary;
    private Date bir;
    private List<String> lists;
    private String[] qqs;
    private ClazzDAO clazzDAO;
    private List<ClazzDAO> clazzDAOs;
    private Map<String,String> map;
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setClazzDAOs(List<ClazzDAO> clazzDAOs) {
        this.clazzDAOs = clazzDAOs;
    }

    public void setClazzDAO(ClazzDAO clazzDAO) {
        this.clazzDAO = clazzDAO;
    }

    public void setQqs(String[] qqs) {
        this.qqs = qqs;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("clazzDAO~~~");
        System.out.println("姓名: "+name);
        System.out.println("年龄: "+age);
        System.out.println("性别: "+sex);
        System.out.println("价格: "+price);
        System.out.println("工资: "+salary);
        System.out.println("生日: "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(bir));
        System.out.println("遍历list集合: ");
        lists.forEach(li -> System.out.println(li));
        System.out.println("遍历数组:");
        for (String qq : qqs) {
            System.out.println(qq);
        }
        System.out.println("clazzDAO: "+clazzDAO);
        System.out.println("遍历clazzDAOs");
        clazzDAOs.forEach(cla -> System.out.println(cla));
        System.out.println("遍历Map:");
        map.forEach((key,value)-> {
            System.out.println(key+ " "+ value);
        });
        System.out.println("遍历properties");
        properties.forEach((k,v)-> System.out.println(k+ " "+v));
    }
}
