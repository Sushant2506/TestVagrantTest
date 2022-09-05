package org.testVagrantCodingTest;

import io.restassured.path.json.JsonPath;
import org.junit.Assert;

import java.util.List;

public class ValidateForeignPlayerCount {
    public void numberOfForeignPlayers(JsonPath teamJSON){
        List<String> country = teamJSON.get("player.country");
        int count=0;
        for(String str:country){
            if(!str.equals("India")){
                count++;
            }

        }
        System.out.println("Total number of foreign players in the team: " +count);
        Assert.assertTrue(count==4);
    }
}
