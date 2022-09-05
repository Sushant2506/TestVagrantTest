package org.testVagrantCodingTest;

import io.restassured.path.json.JsonPath;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ValidateTotalWicketKeeper {
    public void numberOfWicketKeepers(JsonPath teamJSON){
        List<String> role = teamJSON.get("player.role");
        int count=0;
        for(String str:role){
            if(str.equals("Wicket-keeper")){
                count++;
            }
        }
        System.out.println("Total players with role of wicket keeper: "+count);
        Assert.assertTrue(count>=1);
    }
}
