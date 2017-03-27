package com.example.headFirstJava.chapter6;
import java.util.*;
/**
 * Created by perrythomson on 3/13/17.
 */
public class DotCom {

    private ArrayList<String> locationCells;
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "miss";

        int index = locationCells.indexOf(userInput);
        if(index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch you sunk " + name + " :-( ");
            } else {
                result = "hit";
            }
        }
         return result;
    }
}
