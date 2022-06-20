package us.greatapps4you.crud.view;


import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import us.greatapps4you.crud.entities.Customer;
import us.greatapps4you.crud.service.CustomerService;

@Named
@RequestScoped
public class CustomerBean {

	@Inject
	private CustomerService customerService;

	private Customer customer = new Customer();
	private List<Customer> customers;

	@PostConstruct
	private void initCustomers() {
		customers = customerService.list();
	}

	public void save() {
		customerService.create(customer);
		customers.add(customer);
		customer = new Customer();
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}