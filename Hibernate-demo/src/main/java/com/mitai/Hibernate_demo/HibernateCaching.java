package com.mitai.Hibernate_demo;


import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import HibernateMapping.Laptop;
import HibernateMapping.Student;

public class HibernateCaching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 std = null;
		//Student1 std1 = null;

      //Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        Configuration con = new Configuration().configure().addAnnotatedClass(Student1.class);
         ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);//session factory have session objects
        Session session = sf.openSession();//get object of session
        
        
        
       session.beginTransaction();
      Query q1 = (Query) session.createQuery("from new_table where id = 1");
       //testing of 1st level cache in session one
       // ((org.hibernate.Query) q1).setCacheable(true);
       std = (Student1)((org.hibernate.Query) q1).uniqueResult();
       System.out.println("Output is :" + std);
       /*std = (Student1) session.get(Student1.class, 1);
       System.out.println("Output is :" + std.getFullname()); //as session is changed query will run again*/
       session.getTransaction().commit();
     
       
      
       
       /*SessionFactory sf1 = con.buildSessionFactory(reg);//session factory have session objects
       Session session1 = sf1.openSession();
       std1 = (Student1) session1.get(Student1.class, 1);
       System.out.println("Output is :" + std1.getFullname()); //as session is changed query will run again
       session1.getTransaction().commit();*/
       
	}

}
