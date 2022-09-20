package com.capgemini.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


	@Entity
	@Table(name="User")
	public class User {
		
		@Id
		@Column(name="Userid")
		private int Userid;
		private String name;
		private String Type;
		private String Password;
		
		@OneToOne(mappedBy="user")
		private College college;
		//getter setter 
		
		
		public int getUserid() {
			return Userid;
		}


		public void setUserid(int userid) {
			Userid = userid;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getType() {
			return Type;
		}


		public void setType(String type) {
			Type = type;
		}


		public String getPassword() {
			return Password;
		}


		public void setPassword(String password) {
			Password = password;
		}


		public College getCollege() {
			return college;
		}


		public void setCollege(College college) {
			this.college = college;
		}


		
		
		
	}
		