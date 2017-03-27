package com.example.headFirstDesignPatterns.chapter2;

/**
 * Created by perrythomson on 2/27/17.
 */
public class MiniDuckSimulator {

    public static void main (String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly(); //I can't fly
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly(); //I am flying with a rocket
    }
}
