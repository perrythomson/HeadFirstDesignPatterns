package com.example.headFirstJava.chapter5;

/**
 * Created by perrythomson on 3/13/17.
 */
public class Output {
    public static void main(String[] args) {
        Output o = new Output();
        o.go();
    }

    void go() {
        int y = 7;
        for(int x = 1; x < 8; x++) {
            System.out.println("IF1");
            System.out.println("1st: x has the value of " + x + ", and y has the value of " + y);

            y++;
            System.out.println("2nd: x has the value of " + x + ", and y has the value of " + y);

            if(x > 4) {
                System.out.println("IF2");
                System.out.println("Increment y to equal " + ++y + " " );
                System.out.println("3rd: x has the value of " + x + ", and y has the value of " + y);

            }
            if(y > 14) {
                System.out.println("IF3");
                System.out.println(" x = " + x);
                System.out.println("4th: x has the value of " + x + ", and y has the value of " + y);
                break;
            }
        }
    }
}
