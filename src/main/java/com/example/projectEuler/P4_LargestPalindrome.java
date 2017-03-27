package com.example.projectEuler;

/**
 * Created by perrythomson on 3/23/17.
 */
public class P4_LargestPalindrome {
    public static void main (String[] args) {

        int product = 0;
        int max = 0;

        for (int i = 9999; i > 1000; i--) {
            for (int j = i; j > 1000; j--){
                product = i*j;

                if (isPalindrome(product)){
                    if (product > max) {
                        max = product;
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static boolean isPalindrome(int product){
        boolean isPalindrome = false;
        StringBuilder temp = new StringBuilder(Integer.toString(product)).reverse();
        if(temp.toString().equals(Integer.toString(product))) {
            isPalindrome = true;
        }
        return isPalindrome;

    }
}
