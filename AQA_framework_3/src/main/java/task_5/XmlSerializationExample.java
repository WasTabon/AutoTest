import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlSerializationExample {
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();

        File inputFile = new File("input.xml");
        Person person = xmlMapper.readValue(inputFile, Person.class);

        person.setName("John");
        person.getAddress().setCity("San Francisco");

        File outputFile = new File("output.xml");
        xmlMapper.writeValue(outputFile, person);
    }
}
