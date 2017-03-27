package com.example.headFirstJava.chapter10.sharpenYourPencilChapter10;

/**
 * Created by perrythomson on 3/24/17.
 */
public class StaticTests extends StaticSuper {

    static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block " + rand);
    }

    StaticTests () {
        System.out.println("contructor");
    }

    public static void main (String[] args) {
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}
