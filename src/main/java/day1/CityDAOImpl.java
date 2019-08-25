package day1;

public class CityDAOImpl implements CityDAO {
    @Override
    public void save(String name) {
        System.out.println("城市名称: "+name);
    }
}
