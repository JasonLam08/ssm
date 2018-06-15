package com.slsd.dao;

import java.util.List;

import com.slsd.entity.Student;

public interface StudentDao {

	public List<Student> findAllStudent();
	
	public Student findStudentBySid(int sid);
	
	public int addStudent(Student s);
	
	public int delStudent(int sid);
	
	public int updateStudent(Student s);
	
}
