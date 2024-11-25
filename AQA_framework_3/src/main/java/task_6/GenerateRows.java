public class GenerateRows {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            for (int i = 1; i <= 5; i++) {
                Address address = new Address("Street " + i, "City " + i, "State " + i);
                Person person = new Person(true, "Person " + i, address);
                session.save(person);
            }

            transaction.commit();
        }
    }
}
