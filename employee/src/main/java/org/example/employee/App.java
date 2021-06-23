package org.example.employee;


import org.example.demo.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
        Session session=factory.openSession();
        session.getTransaction().begin();
        session.save(new Employee(3, "d", "joe", "Djoe@email.com"));
        //new Random().nextInt()
        session.getTransaction().commit();
        System.out.println("one item saved");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
