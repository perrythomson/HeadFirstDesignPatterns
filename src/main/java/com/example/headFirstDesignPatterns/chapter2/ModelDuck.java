package com.example.headFirstDesignPatterns.chapter2;

/**
 * Created by perrythomson on 2/27/17.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a model duck.");
    }
}
