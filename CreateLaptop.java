package learn.hibernate3.Hibernate_4crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateLaptop {
//object creation
	Laptop1 l1 = new Laptop1(1001,"lenovo",35000);
	Laptop1 l2 = new Laptop1(2002,"hp",30000);
	Laptop1 l3 = new Laptop1(3003,"dell",25000);
	
	//hibernate configuration
    Configuration cfg = new Configuration().configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx=session.beginTransaction();
	
	//session objects

	session.save(l1);
	session.save(l2);
	session.save(l3);
	
	
	tx.commit();
}
