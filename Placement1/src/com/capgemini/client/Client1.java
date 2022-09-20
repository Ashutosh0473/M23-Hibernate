package com.capgemini.client;
import com.capgemini.entities.College;
import com.capgemini.entities.User;
import com.capgemini.services.CollegeService;
import com.capgemini.services.CollegeServiceImpl;

public class Client1 {
public static void main(String[] args) {
		
	College college=new College();
	CollegeService service=new CollegeServiceImpl();
	college.setCollegeName("pillai");
	college.setId(121);
	college.setLocation("panvel");

	/*College c=new College();
	c.setCollegeName("pillai HOC");
	c.setId(122);
	c.setLocation("new panvel");*/

//service.addCollege(college);
//System.out.println("data inserted");
         User user=new User();
		user.setUserid(21);
		user.setName("Sayli");
		user.setType("student");
		user.setPassword("say123");
		
	/*
	 	
		User u1=new User();
		u1.setUserid(22);
		u1.setName("Siddha");
		u1.setType("student");
		u1.setPassword("lmn12");
		
		*/
		
		
		
		college.setUser(user);
		user.setCollege(college);
		
		

		
		
		//add college 
		service.addCollege(college);
		//service.addCollege(c);
		//Retrieving a data
				
				
				
				System.out.println("Data is updated");
		
		
}
}