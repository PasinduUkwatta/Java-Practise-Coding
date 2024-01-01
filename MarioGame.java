package org.example;

public class MarioGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("jump");
    }

    @Override
    public void down() {
        System.out.println("goes into the pipe");
    }

    @Override
    public void left() {
        System.out.println("go left");
    }

    @Override
    public void right() {
        System.out.println("go right");
    }
}
