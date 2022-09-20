package com.capgemini.client;

import com.capgemini.entities.Certificate;
import com.capgemini.entities.College;
import com.capgemini.entities.Student;
import com.capgemini.services.StudentService;
import com.capgemini.services.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student=new Student();
	    StudentService service=new StudentServiceImpl();
	  
		student.setId(10);
		student.setRoll(104);
		student.setQualification("BE");
		student.setCourse("IT");
		student.setYear(2022);
		student.setHallTicketNo(1234);
	   
	    
	    Student s=new Student();
	    
	    s.setId(20);
		s.setRoll(112);
		s.setQualification("BE");
		s.setCourse("CS");
		s.setYear(2022);
		s.setHallTicketNo(1990);
	   	    
	    Student s1=new Student();
	    s1.setId(30);
		s1.setRoll(232);
		s1.setQualification("BE");
		s1.setCourse("ELEC");
		s1.setYear(2022);
		s1.setHallTicketNo(1525);
	   
	
		
          		
		
		Certificate certificate=new Certificate();
		certificate.setCert_id(1235);
		certificate.setYear(2022);
		certificate.setStudent(student);
		
		
		
		
		 
		Certificate c=new Certificate();
		c.setStudent(s);
		c.setCert_id(1678);
		c.setYear(2022);
		
		
		Certificate c1=new Certificate();
		c1.setStudent(s1);
         c1.setCert_id(87654);
         c1.setYear(2022);
		
		//oneToOne bidirectional
		student.setCertificate(certificate);
		certificate.setStudent(student);
		
		
		
		s.setCertificate(c);
		c.setStudent(s);
		
		s1.setCertificate(c1);
		c1.setStudent(s1);
		
		//update data 
		
		service.addStudent(student);
		service.addStudent(s);
		service.addStudent(s1);
		
		
		System.out.println("Data Added");
				
		
	}

}
