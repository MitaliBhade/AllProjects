package HibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.mitai.Hibernate_demo.Student1;

public class HibernateMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Student s = new Student();
		s.setRollno(1);
		s.setName("Mitali");
		s.setMarks(30);
		
		Student s1 = new Student();
		s1.setRollno(2);
		s1.setName("Harshal");
		s1.setMarks(45);
		
		
		Laptop L = new Laptop();
		L.setId(101);
		L.setLname("Dell");
		Laptop L1 = new Laptop();
				L1.setId(102);
				L1.setLname("HP");
		//s.setLaptop(L);
		s.getLaptop().add(L);
		s.getLaptop().add(L1);
		L.getStudent().add(s);
		L.getStudent().add(s1);
		L1.getStudent().add(s);
		//s.getLaptop().add(L1);*/
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);//session factory have session objects
        Session session = sf.openSession();//get object of session
        
       session.beginTransaction();
       
       
      /* session.save(L); 
      session.save(L1);
      session.save(s);
       session.save(s1);//save data in database*/
       
      Student student = (Student) session.get(Student.class, 1);
      
       System.out.println("name of student is " + student.getName()); 
      // System.out.println("name of laptop is " + student.getLaptop());
      
        session.getTransaction().commit();
	}

}
