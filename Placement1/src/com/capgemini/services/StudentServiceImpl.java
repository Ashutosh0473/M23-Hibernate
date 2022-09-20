package com.capgemini.services;

import com.capgemini.dao.StudentDao;
import com.capgemini.dao.StudentDaoImpl;
import com.capgemini.entities.Student;

public class StudentServiceImpl implements StudentService{
	
	private StudentDao dao;
	
	public StudentServiceImpl() {
		super();
		dao=new StudentDaoImpl();
	}

	@Override
	public Student addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public boolean deleteStudent(int id) {
		dao.beginTransaction();
		boolean res=dao.deleteStudent(id);
		dao.commitTransaction();
		return res;
	}

	@Override
	public Student searchStudentById(int id) {
		Student student=dao.searchStudentById(id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicketNo(int hallTicketNo) {
		Student student=dao.searchStudentByHallTicketNo(hallTicketNo);
		return student;
	}

	

}