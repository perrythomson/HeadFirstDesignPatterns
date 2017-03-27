package com.example.projectEuler;

/**
 * Created by perrythomson on 3/23/17.
 */
public class P2_EvenFibonacciNumbers {
//        int sum = 0;
//        int x1 = 1;
//        int x2 = 2;
//
//    public static void main(String args[]) {
//        while (x1 < 4000000) {
//            if ((x1 & 1) == 0) {
//                sum += x1;
//            }
//
//            x2 = x1 + x2;
//            x1 = x2 - x1;
//        }
//
//        System.out.println(sum);
//    }

//    public static void main (String[] args) {
//        int total = 1;
//        int toBeAdded = 1;
//        int limit = 4000000;
//        int totalSum = 0;
//        int temp = 0;
//
//        while (total <= limit) {
//            if (total % 2 == 0) {
//                totalSum = totalSum + total;
//            }
//            temp = toBeAdded;
//            toBeAdded = total;
//            total = toBeAdded + temp;
//        }
//
//        System.out.println("Sum of even numbers is: " + totalSum);
//    }

    public static void main (String[] args) {
        int x1 = 0;
        int x2 = 1;
        int temp = 0;
        int sum = 0;

        do {
            if (x2 % 2 == 0){
                sum = sum + x2;
            }
            temp = x1 + x2;
            x1 = x2;
            x2 = temp;
        } while (x2 < 4000000);

        System.out.println(sum);
    }
}
