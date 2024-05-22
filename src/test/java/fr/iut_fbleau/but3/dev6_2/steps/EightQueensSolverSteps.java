package fr.iut_fbleau.but3.dev6_2.steps;

import fr.iut_fbleau.but3.dev6_2.EightQueensSolver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EightQueensSolverSteps {
    private EightQueensSolver eightQueensSolver;

    @Given("un echiquier")
    public void unEchiquier() {
        this.eightQueensSolver = new EightQueensSolver();
    }

    @When("placer une reine en {int}, {int}")
    public void placerUnReineEn(int x, int y) {
        this.eightQueensSolver.getChessboard().placeQueen(x,y);
    }

    @Then("{int} reine sur l'échiquier")
    public void reineSurLEchiquier(int queensOnChessboard) {
        assertEquals(1, this.eightQueensSolver.getChessboard().getNumberOfQueen());
    }
}
