package com.example.headFirstJava.chapter5.samplePractice;

/**
 * Created by perrythomson on 3/13/17.
 */
public class SimpleDotComTestDrive {

    public static void main(String[] args) {

        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {4, 5, 6};
        dot.setLocationCells(locations);
        String userGuess = "4";
        String result = dot.checkYourself(userGuess);
    }
}
