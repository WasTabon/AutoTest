import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            
            Address address = new Address("123 Main St", "Los Angeles", "CA");

            Person person = new Person(true, "Mark", address);

            Phone phone1 = new Phone("1234567890", person);
            Phone phone2 = new Phone("0987654321", person);

            Course course1 = new Course("Mathematics");
            Course course2 = new Course("Physics");

            person.setCourses(Arrays.asList(course1, course2));

            person.setPhones(Arrays.asList(phone1, phone2));

            session.save(person);

            transaction.commit();
        }
    }
}
