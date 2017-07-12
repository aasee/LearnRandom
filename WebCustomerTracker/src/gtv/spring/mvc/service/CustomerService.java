package gtv.spring.mvc.service;

import java.util.List;

import gtv.spring.mvc.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();

	public void saveOrUpdateCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);
}
