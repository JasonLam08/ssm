package com.slsd.service;

import java.util.List;

import com.slsd.entity.Student;

public interface StudentService {

	public List<Student> findAllStudent();

	public Student findStudentBySid(int sid);

	public boolean addStudent(Student s);

	public boolean updateStudent(Student s);

	public boolean delStudent(int sid);

	
}
