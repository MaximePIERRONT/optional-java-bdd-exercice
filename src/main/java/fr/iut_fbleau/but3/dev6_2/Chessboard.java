package fr.iut_fbleau.but3.dev6_2;

import java.util.ArrayList;
import java.util.List;

public class Chessboard {
    private static final int SIZE = 8;
    private final int[][] gameBoard = new int[SIZE][SIZE];

    private final List<Position> queensPosition = new ArrayList<>();

    public Chessboard(){

    }

    public void placeQueen(int x, int y){
        gameBoard[x][y] = 1;
        queensPosition.add(new Position(x,y));
    }

    public int getNumberOfQueen() {
        return queensPosition.size();
    }
}
