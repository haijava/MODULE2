package hai.exam1.repository;

import hai.exam1.model.Item;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CartRepository extends PagingAndSortingRepository<Item,Long> {
}
