package org.example;

public class GameRunner {
    public static void main(String[] args) {
        MarioGame marioGame =new MarioGame();
        ChessGame chessGame =new ChessGame();
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();

        chessGame.up();
        chessGame.down();
        chessGame.left();
        chessGame.right();
    }
}
