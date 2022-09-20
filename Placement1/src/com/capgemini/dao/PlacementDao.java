package com.capgemini.dao;

import com.capgemini.entities.Placement;

public interface PlacementDao {
	
	public  abstract Placement addPlacement(Placement placement);
	public abstract Placement updatePlacement(Placement placement);
	public abstract Placement  searchPlacementByid(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();



}
