package di;

public class StudentServiceImpl implements StudentService {

    //依赖
    private StudentDAO studentDAO;

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public void save(String name) {
        System.out.println("Service: "+name);
        studentDAO.save(name);
    }
}
