import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class SerializationExample {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        File inputFile = new File("input.json");
        Person person = objectMapper.readValue(inputFile, Person.class);

        person.setName("John");
        person.getAddress().setCity("San Francisco");

        File outputFile = new File("output.json");
        objectMapper.writeValue(outputFile, person);
    }
}
