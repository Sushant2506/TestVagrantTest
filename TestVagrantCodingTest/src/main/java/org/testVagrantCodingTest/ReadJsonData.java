package org.testVagrantCodingTest;


import io.restassured.path.json.JsonPath;
import java.io.File;
import java.io.IOException;


public class ReadJsonData {
    public JsonPath readJSONData(String path) throws IOException{
        File teamJson = new File(path);
        JsonPath jsonPath = JsonPath.given(teamJson);
        return  jsonPath;
    }
}
