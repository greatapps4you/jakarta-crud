package us.greatapps4you.crud.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
