package com.capgemini.services;

import com.capgemini.dao.CollegeDao;
import com.capgemini.dao.CollegeDaoImpl;
import com.capgemini.dao.PlacementDao;
import com.capgemini.dao.PlacementDaoImpl;
import com.capgemini.entities.College;
import com.capgemini.entities.Placement;

public class PlacementServiceImpl implements PlacementService {
 private PlacementDao dao;
	
	public PlacementServiceImpl() {
		super();
		dao=new PlacementDaoImpl();
	}
	@Override
	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacementByid(int id) {
		Placement placement=dao.searchPlacementByid(id);
		return placement;

	}

}
