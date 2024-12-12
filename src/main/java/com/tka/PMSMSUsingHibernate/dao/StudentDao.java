package com.tka.PMSMSUsingHibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.PMSMSUsingHibernate.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory factory;
	
	
	
	
	public Student insertStudent(Student s)
	{
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(s);
		tx.commit();
		return s;
	}
	
	
	public Student updateStudent(Student s)
	{
		Session session=factory.openSession();
		
		//Load the Student data From database
		Student t=session.load(Student.class, s.getSid());
		
		//assigning updated data
		Transaction tx=session.beginTransaction();
		t.setName(s.getName());
		t.setMarks(s.getMarks());
		session.save(t);
		tx.commit();
		return t;
	}
}
