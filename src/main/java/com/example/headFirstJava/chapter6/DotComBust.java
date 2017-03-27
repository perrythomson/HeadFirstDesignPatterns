package com.example.headFirstJava.chapter6;

import java.util.*;
/**
 * Created by perrythomson on 3/13/17.
 */
public class DotComBust{

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    public void setUpGame() {

        DotCom one = new DotCom();
        one.setName("Pets.com");

        DotCom two = new DotCom();
        one.setName("Nike.com");

        DotCom three = new DotCom();
        one.setName("ABC.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink 3 DotCom's.");
        System.out.println("Pets.com, Nike.com and ABC.com are your targets.");
        System.out.println("Try to sink them with the fewest amount of guesses");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a new guess: ");
            checkUserGuess(userGuess);
            }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for(DotCom dotComToTest : dotComsList){
            result = dotComToTest.checkYourself(userGuess);
            if(result.equals("hit")) {
                break;
            }
            if(result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All DotComss are dead!");
        if(numOfGuesses < 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses");
            System.out.println("Fish are dancing with your options");
        }
    }

    public static void main (String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
