package hai.exam1.service.impl;

import hai.exam1.model.Category;
import hai.exam1.model.Product;
import hai.exam1.repository.ProductRepository;
import hai.exam1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;


    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findId(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);

    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);

    }

    @Override
    public Iterable<Product> findByCategory(Category category) {
        return productRepository.findAllByCategory(category);
    }

   /* @Override
    public Iterable<Product> findAllByPrice(Long price) {
        return productRepository.findAllByNameAndOrderByPriceDesc(price);
    }*/


}

