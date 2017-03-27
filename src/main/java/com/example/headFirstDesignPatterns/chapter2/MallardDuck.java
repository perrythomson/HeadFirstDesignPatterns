package com.example.headFirstDesignPatterns.chapter2;

/**
 * Created by perrythomson on 2/27/17.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck.");
    }
}
