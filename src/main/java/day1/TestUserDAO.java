package day1;

public class TestUserDAO {
    public static void main(String[] args) {

        //创建组件对象
        UserDAO userDAO = new UserDAOImpl();
        userDAO.save("xiaohei");

    }
}
