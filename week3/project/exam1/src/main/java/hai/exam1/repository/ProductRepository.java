package hai.exam1.repository;

import hai.exam1.model.Category;
import hai.exam1.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product,Long> {
    Iterable<Product> findAllByCategory(Category category);
    /*Iterable<Product> findAllByNameAndOrderByPriceDesc(Long price);*/

}
