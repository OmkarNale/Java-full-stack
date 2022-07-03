package gl.customer.services;

import java.util.List;

import org.springframework.stereotype.Service;

import gl.customer.entities.Customer;

@Service
public interface CustomerService {

	public List<Customer> findAll();

	public Customer findById(int id);

	public void save(Customer customer);

	public void deleteById(int id);

}
