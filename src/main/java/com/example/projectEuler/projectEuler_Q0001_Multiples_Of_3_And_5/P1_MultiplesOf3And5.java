package com.example.projectEuler.projectEuler_Q0001_Multiples_Of_3_And_5;

import java.util.ArrayList;

/**
 * Created by perrythomson on 3/23/17.
 */
public class P1_MultiplesOf3And5 {
    public static void main (String[] args) {
//        ArrayList<Integer> x = new ArrayList<Integer>();
//        ArrayList<Integer> y = new ArrayList<Integer>();
//        int sumOf3 = 0;
//        int sumOf5 = 0;
//
//        int total = 0;
//
//        for(int temp = 0; temp < 1000; temp++) {
//            if(temp % 3 == 0) {
//                x.add(temp);
//                sumOf3 += temp;
//            } else if (temp % 5 ==0){
//                y.add(temp);
//                sumOf5 += temp;
//            }
//        }
//        total = sumOf3 + sumOf5;
//
//        System.out.println("The sum of the multiples of 3 and 5 is: " + total);
        System.out.println("The sum of the multiples of 3 and 5 is: " + getSum());
    }
    
    private static int getSum() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
