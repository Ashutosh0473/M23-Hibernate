package com.capgemini.dao;

import javax.persistence.EntityManager;

import com.capgemini.entities.College;


public class CollegeDaoImpl implements CollegeDao
{
private EntityManager em;
	
	

	public CollegeDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}
	@Override
	public College addCollege(College college) {
		em.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		em.merge(college);
		return college;
	}

	@Override
	public College searchCollegeByid(int Id) {
		College college=em.find(College.class,Id);
		return college;
	}

	@Override
	public boolean deleteCollege(int Id) {
		em.remove(Id);
		return false;
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();

		
	}


}
