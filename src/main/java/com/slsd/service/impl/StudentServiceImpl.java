package com.slsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.slsd.dao.StudentDao;
import com.slsd.entity.Student;
import com.slsd.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentDao sdao;

	public List<Student> findAllStudent() {
		return sdao.findAllStudent();
	}

	public Student findStudentBySid(int sid) {
		return sdao.findStudentBySid(sid);
	}

	public boolean addStudent(Student s) {
		return (sdao.addStudent(s) > 0) ? true : false;
	}

	public boolean updateStudent(Student s) {
		return (sdao.updateStudent(s) > 0) ? true : false;
	}

	public boolean delStudent(int sid) {
		return (sdao.delStudent(sid) > 0) ? true : false;
	}

}
