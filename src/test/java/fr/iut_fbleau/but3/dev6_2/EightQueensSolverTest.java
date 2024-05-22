package fr.iut_fbleau.but3.dev6_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class EightQueensSolverTest {

    private EightQueensSolver eightQueensSolver;

    @BeforeEach
    public void beforeEach(){
        this.eightQueensSolver = new EightQueensSolver();
    }

    @Test
    void getChessBoardOfSolver(){
        Chessboard chessboard = this.eightQueensSolver.getChessboard();
        assertNotNull(chessboard);
    }
}