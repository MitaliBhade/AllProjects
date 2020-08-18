package com.mitai.Hibernate_demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Studentdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration con = new Configuration().configure().addAnnotatedClass(Student1.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);//session factory have session objects
        Session session = sf.openSession();//get object of session
        
        Transaction tx  = session.beginTransaction();
        
        Query Q1 = session.createQuery("from new_table where id > 12");
        
        List<Student1> student1 = Q1.list();
        System.out.println(student1);
       for(Student1 s :student1) {
    	   
    	   System.out.println(s.getId()+ " " + s.getFullname()+" " + s.getEmail());
    	   System.out.println(s);
    	   
       }
        
       /* for(int i = 0 ; i < 20 ; i++) {
        	
        	Student1 std = new Student1();
        	std.setId(i);
        	std.setFullname("name" + i);
        	std.setEmail("email" + i);
        	session.save(std);
        	
        }*/ //create entry of 20 studen in database table
        
        session.getTransaction().commit();
	}

}
