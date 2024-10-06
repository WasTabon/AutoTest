public class DeletePerson {
    public static void main(String[] args) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            Person person = session.get(Person.class, 1L);
            if (person != null) {
                session.delete(person);
            }

            transaction.commit();
        }
    }
}
