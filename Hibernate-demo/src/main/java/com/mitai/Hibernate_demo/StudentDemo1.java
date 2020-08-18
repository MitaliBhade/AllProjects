package com.mitai.Hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class StudentDemo1
{
    public static void main( String[] args )
    {
           Student1 std1 = new Student1();
           Student_Fullname fullname = new Student_Fullname();
           fullname.setFname("Mitali2");
           fullname.setMname("Milind2");
           fullname.setLname("Bhade2");
           
            std1.setId(3);
          //  std1.setFullname(fullname);
          // std1.setLastname("Bhade");
           std1.setEmail("Blue2");
           
            
         
           
           Configuration con = new Configuration().configure().addAnnotatedClass(Student1.class);
           
           ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
           SessionFactory sf = con.buildSessionFactory(reg);//session factory have session objects
           Session session = sf.openSession();//get object of session
           
           Transaction tx  = session.beginTransaction();
          
         //  std1 = (Student1) session.get(Student1.class, 1);
          session.save(std1); //save data in database
           tx.commit();
           
          System.out.println("output is " + std1.toString());
    }
}
