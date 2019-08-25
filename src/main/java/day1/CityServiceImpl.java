package day1;

public class CityServiceImpl implements CityService {

    //需要谁声明谁为成员变量 并提供公开的SET方法     需要称之为依赖
    private CityDAO cityDAO;


    public void setCityDAO(CityDAO cityDAO) {
        this.cityDAO = cityDAO;
    }

    @Override
    public void save(String name) {
        System.out.println("cityService城市名称: "+name);
        cityDAO.save(name);
    }
}
