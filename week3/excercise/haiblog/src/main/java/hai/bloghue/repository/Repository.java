package hai.bloghue.repository;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();
    T findId(Long id);
    void save(T model);
    Void edit(T model);
    Void remove(Long id);

}
