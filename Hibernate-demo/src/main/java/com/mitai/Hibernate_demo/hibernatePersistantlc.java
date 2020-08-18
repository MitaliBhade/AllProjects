package com.mitai.Hibernate_demo;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class hibernatePersistantlc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Configuration con = new Configuration().configure().addAnnotatedClass(Student1.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);//session factory have session objects
        Session session = sf.openSession();//get object of session
        
        session.beginTransaction();
      Student1 std = new Student1();
    //  Object std = session.get(Student1.class, 1);
        //Object std = session.load(Student1.class, 2);
       std.setId(2);
        std.setFullname("Mitali");
        std.setEmail("mitali@test1.com");
        
        session.save(std);
        //std.setFullname("mitali harshal");
       
       // System.out.println(std.toString());
        
      //  EntityManager em = 
      // Student1 std = find(Student1.class,1);
        session.getTransaction().commit();
	}

}
