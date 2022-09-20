package com.capgemini.services;

import com.capgemini.entities.College;

public interface CollegeService {
	
	public abstract College addCollege(College college);
	public abstract College updateCollege(College college);
	public abstract College searchCollegeByid(int Id); 
	public abstract boolean deleteCollege(int Id);
	
}
