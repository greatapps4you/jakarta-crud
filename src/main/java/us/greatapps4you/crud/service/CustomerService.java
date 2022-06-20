package us.greatapps4you.crud.service;

import java.util.List;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import us.greatapps4you.crud.entities.Customer;

@Stateless
public class CustomerService {

	@PersistenceContext
	private EntityManager entityManager;

	public void create(Customer customer) {
		entityManager.persist(customer);
	}

	public List<Customer> list() {
		return entityManager.createQuery("FROM Customer c", Customer.class).getResultList();
	}

}
