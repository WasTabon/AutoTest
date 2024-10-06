public class UpdatePerson {
    public static void main(String[] args) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            
            Person person = session.get(Person.class, 1L);
            person.setName("John");
            session.update(person);
            
            transaction.commit();
        }
    }
}
