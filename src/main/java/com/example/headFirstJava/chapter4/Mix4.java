package com.example.headFirstJava.chapter4;

/**
 * Created by perrythomson on 3/13/17.
 */
public class Mix4 {
    int counter = 0;
    public static void main(String[] args) {
        int count = 0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;
        while( x < 9 ){
            m4a[x] = new Mix4();
                System.out.println("1st " + count + " " + x);

            m4a[x].counter = m4a[x].counter + 1;
                System.out.println("2nd " + count + " " + m4a[x].counter);

            count = count + 1;
                System.out.println("3rd " + count + " " + m4a[x].counter);

            count = count + m4a[x].maybeNew(x);
                System.out.println("4th " + count + " " + m4a[x].maybeNew(x));

            x = x + 1;
                System.out.println("while loop x = " + count + " " + x);
        }
        System.out.println("one iteration of while loop " + count + " " + x + " " + m4a[1].counter);
    }

    public int maybeNew(int index){
        if( index < 5  ) {
            Mix4 m4  = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}
