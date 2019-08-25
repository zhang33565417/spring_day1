package scope;

public class PersonDAOImpl implements PersonDAO {

    //自定初始化方法
    public void init152(){
        System.out.println("初始化方法...");
    }

    @Override
    public void save(String name) {
        System.out.println("姓名: "+name);
    }

    //自定义销毁方法
    public void destroy(){
        System.out.println("销毁方法...");
    }
}
