package com.capgemini.dao;

import javax.persistence.EntityManager;

import com.capgemini.entities.Placement;

public class PlacementDaoImpl implements PlacementDao{
private EntityManager em;
	
	

	public PlacementDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		em.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		em.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacementByid(int id) {
		Placement placement=em.find(Placement.class,id);
		return placement;
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
