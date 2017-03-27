package com.example.headFirstJava.chapter3;

/**
 * Created by perrythomson on 3/13/17.
 */
public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        //need to start z at -1 since array is 0 through 4 per equation in ln 15
        int z = -1;

        while(z < 2) {
            z = z + 1;

            h[z] = new Hobbits();
            h[z].name = "bilbo";

            if (z == 1) {
                h[z].name = "frodo";
            }

            if(z == 2) {
                h[z].name = "sam";
            }
            System.out.println(h[z].name + " is a ");
            System.out.println("Good hobbit name.");
        }
    }
}
