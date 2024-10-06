import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainApp {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Los Angeles", "CA");
        Person person = new Person(true, "Mark", address);

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(person);
            transaction.commit();
        }

        // Read example
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Person fetchedPerson = session.get(Person.class, person.getId());
            System.out.println(fetchedPerson.getName() + " lives at " + fetchedPerson.getAddress().getStreet());
        }
    }
}
