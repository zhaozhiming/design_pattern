package design.principle.isp;

public interface Dao {
    void insert(Object record);

    void delete(Object record);

    Object queryBy(int id);

    Object queryBy(String name);

}
