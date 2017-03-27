package com.example.headFirstJava.chapter5;

/**
 * Created by perrythomson on 3/13/17.
 */
public class MixFor5 {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++){
            for (int inner = 4; inner > 1; inner--) {
                System.out.println("top of loop, outer is " + outer + ", inner is " + inner);

                x = x + 3;
                System.out.println("x has changed to " + x);

                y = y - 2;
                System.out.println("y has changed to " + y);

                if(x == 6) {
                    System.out.println("BREAK POINT");
                    break;
                }
                x = x + 3;
                System.out.println("2nd x has changed to " + x);
            }
            y = y - 2;
            System.out.println("2nd y has changed to " + y);
        }
        System.out.println(x + " " + y);
    }
}
