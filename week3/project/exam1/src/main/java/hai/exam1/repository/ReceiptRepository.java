package hai.exam1.repository;

import hai.exam1.model.Receipt;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ReceiptRepository extends PagingAndSortingRepository<Receipt,Long> {
}
