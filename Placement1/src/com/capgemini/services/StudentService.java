package com.capgemini.services;

import com.capgemini.entities.Student;

public interface StudentService
{
	public abstract Student addStudent(Student student);
	public abstract Student updateStudent(Student student);
	public abstract boolean deleteStudent(int id);
	public abstract Student searchStudentById(int id);
	public abstract Student searchStudentByHallTicketNo(int hallTicketNo);
}
