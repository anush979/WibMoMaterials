package main;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myEntitynagaer")
public class MyEntityManagerClass {
	@PersistenceContext
	EntityManager entityManager;
}
