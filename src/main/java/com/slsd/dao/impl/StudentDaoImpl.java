package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.StudentDao;
import com.slsd.entity.Student;
@Repository("studentDao")
public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void sqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
			super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	public List<Student> findAllStudent() {
		SqlSession session = this.getSqlSession();
		List<Student> slist = session.selectList("findAllStudent");
		return slist;
	}

	public Student findStudentBySid(int sid) {
		SqlSession session = this.getSqlSession();
		Student s = session.selectOne("findStudentBySid");
		return s;
	}

	public int addStudent(Student s) {
		SqlSession session = this.getSqlSession();
		int row = session.insert("addStudent",s);
		return row;
	}

	public int delStudent(int sid) {
		SqlSession session = this.getSqlSession();
		int row = session.delete("delStudent",sid);
		return row;
	}

	public int updateStudent(Student s) {
		SqlSession session = this.getSqlSession();
		int row = session.update("updateStudent",s);
		return row;
	}

}
