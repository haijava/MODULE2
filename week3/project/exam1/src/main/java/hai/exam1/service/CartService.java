package hai.exam1.service;


import hai.exam1.model.Item;

public interface CartService {
    Iterable<Item>findAll();
    Item findById(Long id);
    void save(Item item);
    void delete(Long id);
}
