import javax.persistence.*;

@Entity
@Table(name = "phone")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Phone() {}

    public Phone(String phoneNumber, Person person) {
        this.phoneNumber = phoneNumber;
        this.person = person;
    }
}
