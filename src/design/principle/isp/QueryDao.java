package design.principle.isp;

public class QueryDao implements Dao2 {

    @Override
    public Object queryBy(int id) {
        return null;
    }

    @Override
    public Object queryBy(String name) {
        return null;
    }
}
