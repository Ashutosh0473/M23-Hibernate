package com.cg.singleinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em=factory.createEntityManager();
	em.getTransaction().begin();
	
	//create an employee1
	Employee e=new Employee();
	e.setName("ashutosh");
	e.setSalary(45000);
	em.persist(e);
	
	//create an employee1
		Employee e1=new Employee();
		e1.setName("rahul");
		e1.setSalary(45000);
		em.persist(e1);
		
		
		//create a manager 
		Manager m=new Manager();
		m.setName("patil saheb");
		m.equals(256666);
		m.setDeptname("information tech");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("the data is added");
		em.close();
		factory.close();
	}

}
