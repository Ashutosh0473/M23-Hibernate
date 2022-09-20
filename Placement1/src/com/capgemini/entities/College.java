package com.capgemini.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


	@Entity
	@Table(name="College")
	public class College {
		
		@Id
        private  int Id;
		private String collegeName;
	    private   String location;
	    
	    @OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="Userid")
	     private  User user;
	    
	   

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}

		public String getCollegeName() {
			return collegeName;
		}

		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

	/*	public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}
	    
	    */
	    
	}
	    