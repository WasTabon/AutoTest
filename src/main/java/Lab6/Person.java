import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_student")
    private boolean isStudent;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;


    public Person() {}

    public Person(boolean isStudent, String name, Address address) {
        this.isStudent = isStudent;
        this.name = name;
        this.address = address;
    }
}
