package learn.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    
	
	public static void main( String[] args )
    {
//        Student st1 = new Student(2 , "Bob" , "HSR", 2022);
//        Student st2 = new Student(3 , "Sumit" , "Silk Board", 2024);
//        Student st3 = new Student(4 , "Akash" , "Banashankari", 2025);
//        Student st5 = new Student(5 , "anil" , "Banashankari", 2019);
//       
//    	   sess.save(st1);
//         sess.save(st2);
//         sess.save(st3);
//    	
        
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
		Session sess = factory.openSession();
//       
         Student st = sess.get(Student.class, 5);
//        st.setYear(2020);
//        st.setAddress("Madivala");
        Transaction tx = sess.beginTransaction();
        
       
 //       sess.persist(st5);        // you can also use sess.update / sess.save  But They are Deprcate(not in use)
        
        sess.remove(st);
        tx.commit();
        
        
    }
}
