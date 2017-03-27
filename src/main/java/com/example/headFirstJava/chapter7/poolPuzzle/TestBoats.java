package com.example.headFirstJava.chapter7.poolPuzzle;

/**
 * Created by perrythomson on 3/17/17.
 */
public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();

        b2.setLength(32);

//        b3.rowTheBoat();
        b1.move(); //drift
        b3.move(); //drift
        b2.move();  //hoist sail
    }
}
