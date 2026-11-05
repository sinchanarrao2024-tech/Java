import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class ReadJson {


    public static void main(String[] args)
            throws IOException, ParseException {

        JSONParser jsonparser = new JSONParser();
        FileReader reader = new FileReader(".\\JSON\\Student.json");
Object obj=jsonparser.parse(reader);
        JSONObject studentobj = (JSONObject) obj;

        String fname = (String) studentobj.get("firstname");
        String lname = (String) studentobj.get("lastname");

        System.out.println("Firstname : " + fname);
        System.out.println("Lastname : " + lname);
    }
}


{
    "firstname": "Rishitha",
    "lastname": "YV"
}
