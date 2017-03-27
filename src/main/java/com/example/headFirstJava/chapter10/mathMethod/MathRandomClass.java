package com.example.headFirstJava.chapter10.mathMethod;

/**
 * Created by perrythomson on 3/24/17.
 */
public class MathRandomClass {
    public static void main (String[] args) {

        //remember a double rounds up to next integer

        //a simple random number
        double r1 = Math.random();
        System.out.println("Double between 0 -> 1: " + r1);

        double x = Math.random();
        System.out.println("Double between 0 -> 1: " + x);


        //double between 0 and 5 and 0 and 20 respectively
        int r2 = (int) (Math.random() * 5);
        System.out.println("Double between 0 and 5:  r2 = " + r2);

        int y = (int) (Math.random() * 20);
        System.out.println("Double between 0 and 20:  y = " + y);


        // integer between 3 and 8 written as [3,8]
        int r3 = (int) (Math.random() * 5) + 3;
        System.out.println("Integer between 3 and 8:  r3 = " + r3);


        //integer between [-10, 10] - maximimum 9
        int z = (int) (Math.random() * 20) - 10;
        System.out.println("Integer between -10 and 10:  z = " + z);
        System.out.println("Math random number is: " + Math.random());
    }
}
