package com.example.projectEuler;

import static java.lang.Long.getLong;

/**
 * Created by perrythomson on 3/23/17.
 */
public class P3_LargetPrimeFactor {

//    public static void main (String[] args) {
//        long number = 600851475143L;
//        long highestPrime = -1;
//
//        for( long i = 2; i <=number; ++i) {
//            if (number % i == 0) {
//                highestPrime = i;
//                number /= i;
//                --i;
//            }
//        }
//
//        System.out.println(highestPrime);
//    }

    public static void main (String[] args) {
        long dividend = 600851475143L;
        long n = 2;

        while(n <  dividend) {
            if (dividend % n == 0) {
                dividend = dividend/n;
            }
            n++;
        }

        System.out.println(n);
    }

}
