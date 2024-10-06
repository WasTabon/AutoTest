
import org.json.JSONObject;
import org.json.XML;

public class Lab5 {
    public static void main(String[] args) {
        // JSON input
        String jsonInput = "{\n" +
                "  \"isStudent\": true,\n" +
                "  \"name\": \"Mark\",\n" +
                "  \"address\": {\n" +
                "    \"street\": \"789 Oak St\",\n" +
                "    \"city\": \"Los Angeles\",\n" +
                "    \"state\": \"CA\"\n" +
                "  }\n" +
                "}";

        // Convert JSON to XML
        JSONObject jsonObject = new JSONObject(jsonInput);
        String xmlOutput = XML.toString(jsonObject, "person");

        // Output the XML
        System.out.println("XML Output:");
        System.out.println(xmlOutput);
    }
}
