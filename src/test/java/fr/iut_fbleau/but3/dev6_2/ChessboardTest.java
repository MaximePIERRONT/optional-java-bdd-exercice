package fr.iut_fbleau.but3.dev6_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessboardTest {

    private Chessboard chessboard;

    @BeforeEach
    public void beforeEach(){
        this.chessboard = new Chessboard();
    }

    @Test
    void placeAQueen(){
        this.chessboard.placeQueen(0,0);
        assertEquals(1, this.chessboard.getNumberOfQueen());
    }
}