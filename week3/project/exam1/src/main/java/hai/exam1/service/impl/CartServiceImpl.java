package hai.exam1.service.impl;


import hai.exam1.model.Item;
import hai.exam1.repository.CartRepository;
import hai.exam1.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public Iterable<Item> findAll() {
        return cartRepository.findAll();
    }

    @Override
    public Item findById(Long id) {
        return cartRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Item item) {
cartRepository.save(item);
    }

    @Override
    public void delete(Long id) {
cartRepository.deleteById(id);
    }
}

