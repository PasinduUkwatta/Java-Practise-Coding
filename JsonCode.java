import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonCode {
    public static void main(String[] args) {

        JSONObject j =new JsonCode().createJSON();
        new JsonCode().printJSON(j);
        new JsonCode().writeToFile(j,"C:\\Users\\Pasindu Thiwanka\\Desktop\\Self Study\\Java");
        new JsonCode().readJSON("C:\\Users\\Pasindu Thiwanka\\Desktop\\Self Study\\Java");


        System.out.println(j);
    }


    private JSONObject createJSON(){
        JSONObject j = new JSONObject();
        j.put("firstname","john");
        j.put("lastname","paul");
        j.put("email","john@gmail.com");
        j.put("marks",new Integer(45));

        return j;

    }

    private void printJSON(JSONObject json){
        System.out.println(json);
    }

    private void writeToFile throws void IOException(JSONObject json, String absoluteFileName) throws IOException {
        FileWriter jsonFileWritter;
        jsonFileWritter = new FileWriter(absoluteFileName);
        jsonFileWritter.write(json.toJSONString());
        jsonFileWritter.flush();
        jsonFileWritter.close();

    }

    private void readJSON throws IOException(String absoluteFileName){
      JSONObject jsonObject =(JSONObject)  new JSONParser().parse(new FileReader(absoluteFileName));
      System.out.println(jsonObject.get("firstname"));
      System.out.println( jsonObject.get("lastname"));
      System.out.println(jsonObject.get("email"));

    }

}
