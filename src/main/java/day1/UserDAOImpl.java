package day1;

public class UserDAOImpl implements UserDAO {

    @Override
    public void save(String name) {
        System.out.println("姓名: "+name);
    }
}
