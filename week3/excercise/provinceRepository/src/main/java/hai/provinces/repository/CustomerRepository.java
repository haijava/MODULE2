package hai.provinces.repository;

import hai.provinces.model.Customer;
import hai.provinces.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
    Iterable<Customer>findAllByProvince(Province province);
    Iterable<Customer>findAllByFirstName(String firstName);
}
