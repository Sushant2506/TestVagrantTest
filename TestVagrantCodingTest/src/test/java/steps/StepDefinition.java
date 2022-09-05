package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import org.testVagrantCodingTest.GetFilePath;
import org.testVagrantCodingTest.ReadJsonData;
import org.testVagrantCodingTest.ValidateForeignPlayerCount;
import org.testVagrantCodingTest.ValidateTotalWicketKeeper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class StepDefinition {
    ReadJsonData readJsonData;
    ValidateForeignPlayerCount validateForeignPlayerCount;
    ValidateTotalWicketKeeper validateTotalWicketKeeper;
    JsonPath teamJsonData;
    @Given("I read the contents of input json file")
    public void iReadTheContentsOfInputJsonFile() throws IOException {
        String path = GetFilePath.getFileLocation();
        readJsonData = new ReadJsonData();
        teamJsonData = readJsonData.readJSONData(path);

    }

    @Then("I validate there are only four foreign players")
    public void iValidateThereAreOnlyFourForeignPlayers() {
        validateForeignPlayerCount = new ValidateForeignPlayerCount();
        validateForeignPlayerCount.numberOfForeignPlayers(teamJsonData);
    }

    @Then("I validate that there is at least one wicket keeper")
    public void iValidateThatThereIsAtLeastOneWicketKeeper() {
        validateTotalWicketKeeper = new ValidateTotalWicketKeeper();
        validateTotalWicketKeeper.numberOfWicketKeepers(teamJsonData);
    }
}
