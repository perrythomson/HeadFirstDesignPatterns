package com.example.headFirstJava.chapter2.guessingNumberGame;

/**
 * Created by perrythomson on 3/10/17.
 */
public class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random()*20);
        System.out.println("I'm guessing the number is " + number);
    }
}
