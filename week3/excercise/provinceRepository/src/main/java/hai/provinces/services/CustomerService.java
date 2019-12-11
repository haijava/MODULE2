package hai.provinces.services;

import hai.provinces.model.Customer;
import hai.provinces.model.Province;

import java.util.List;

public interface CustomerService {
    Iterable<Customer>findAll();
    Customer findById(Long id);
    void save(Customer customer);
    void remove(Long id);
    Iterable<Customer>findAllByProvince(Province province);

}
