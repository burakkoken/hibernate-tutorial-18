import Models.Employee;
import Models.Job;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Burak Köken on 5.7.2017.
 */
public class HibernateTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setName("Burak Köken");
        employee1.setSalary(4000);

        Job job1 = new Job();
        job1.setName("Software Developer");
        Job job2 = new Job();
        job2.setName("Computer Engineering");

        employee1.getJobList().add(job1);
        employee1.getJobList().add(job2);

        /*
        job1.getEmployeeList().add(employee1);
        job2.getEmployeeList().add(employee1);
        */

        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.persist(employee1);
        /*
        session.save(job1);
        session.save(job2);
        session.save(employee1);
        */
        session.getTransaction().commit();
        session.close();

    }
}
