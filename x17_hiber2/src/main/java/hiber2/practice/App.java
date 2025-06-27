
package hiber2.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();

		Employee emp2 = new Employee("Babu", 23000, "SDE", "fullstack dev");
		Employee emp3 = new Employee("Calvin", 24000, "SDE-1", "System design");
		Employee emp4 = new Employee("Devid", 25000, "SDE-senior", "Data Engineer");
		sess.persist(emp2);
		sess.persist(emp3);
		sess.persist(emp4);
		

		sess.getTransaction().commit();
	}
}
