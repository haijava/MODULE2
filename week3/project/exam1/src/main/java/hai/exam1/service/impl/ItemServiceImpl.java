package hai.exam1.service.impl;

import hai.exam1.model.Item;
import hai.exam1.repository.ItemRepository;
import hai.exam1.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;
    @Override
    public Iterable<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item findId(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Item item) {
        itemRepository.save(item);

    }

    @Override
    public void delete(Long id) {
itemRepository.deleteById(id);
    }
}
