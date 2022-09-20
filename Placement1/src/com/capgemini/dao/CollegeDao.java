package com.capgemini.dao;

import com.capgemini.entities.College;

public interface CollegeDao {
	public abstract College addCollege(College college);
	public abstract College updateCollege(College college);
	public abstract College searchCollegeByid(int Id); 
	public abstract boolean deleteCollege(int Id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();

}
