package autodi;

//autodi 需要那个组件声明那个组件为成员变量  为成员变量提供set方法
public class DeptServiceImpl implements DeptService {

    private DeptDAO deptDAO;

    public void setDeptDAO(DeptDAO deptDAO) {
        this.deptDAO = deptDAO;
    }

    @Override
    public void delete() {
        System.out.println("deptService");
        deptDAO.delete();
    }
}
