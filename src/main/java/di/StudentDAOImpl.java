package di;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public void save(String name) {
        System.out.println("学生姓名: "+name);
    }
}
