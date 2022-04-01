package cucumber.stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.newlight77.kata.bowlingGame.BowlingGame;
import org.junit.jupiter.api.Assertions;


public class GameBowlingStepDef {

    private BowlingGame bowlingGame;

    private String line;
    private Integer score;

    @Before
    public void setUp(){
        bowlingGame = new BowlingGame();
    }

    @Given("Line is {string}")
    public void acceptFrameGlue(String line){
        this.line = line;
    }

    @When("Calculate score")
    public void calculateGlue(){
        score = bowlingGame.calculateScore(line);
    }

    @Then("Result is {int}")
    public void acceptFrame(Integer res){
        Assertions.assertEquals(res , score);
    }

}
