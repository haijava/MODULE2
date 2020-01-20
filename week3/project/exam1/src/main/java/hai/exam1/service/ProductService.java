package hai.exam1.service;

import hai.exam1.model.Category;
import hai.exam1.model.Product;

public interface ProductService {
    Iterable<Product> findAll();
    Product findId(Long id);
    void save(Product product);
    void delete(Long id);
    Iterable<Product> findByCategory(Category category);
   /* Iterable<Product> findAllByPrice(Long price);*/

}
