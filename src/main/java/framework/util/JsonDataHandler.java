package framework.util;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;

public class JsonDataHandler {

    private JSONObject data;
    private String testDataPath = "./testdata/testdata.json";

    public JsonDataHandler(String scenarioID){
        loadData(scenarioID);
    }

    private void loadData(String scenarioID){
        try {
            JSONObject allScenarios = new JSONObject(new JSONTokener(new FileReader(testDataPath)));
            if(allScenarios.has(scenarioID)){
                data = allScenarios.getJSONObject(scenarioID);
            }
        }catch (Exception e){

        }

    }

    public String getValue(String key) throws Exception {
        try {
            if (data.has(key)){
                return data.getString(key);
            }
        }catch(Exception e){
            throw new Exception("Key value doesn't exist: " + key);
        }
        return "";
    }

}
