package hai.exam1.service;

import hai.exam1.model.Item;
import hai.exam1.model.Product;

public interface ItemService {
    Iterable<Item> findAll();
    Item findId(Long id);
    void save(Item item);
    void delete(Long id);
}
