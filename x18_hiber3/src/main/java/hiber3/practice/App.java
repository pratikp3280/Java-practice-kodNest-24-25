package hiber3.practice;

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

		Person p1 = new Person();
		Person p2 = new Person();
		
		
		AdharCard ac1 =  new AdharCard(1111, "pratik", "btm", "male", p1);
		AdharCard ac2 =  new AdharCard(2222, "pramod", "bgm", "male", p2);
				
		
		p1.setId(101);
		p1.setNickName("pattu");
		p1.setCard(ac1);
		sess.persist(p1);
		sess.persist(ac1);
		
		p2.setId(102);
		p2.setNickName("pammu");
		p2.setCard(ac2);
		sess.persist(p2);
		sess.persist(ac2);

		sess.getTransaction().commit();
	}
}


//https://github.com/deep473/hiber24