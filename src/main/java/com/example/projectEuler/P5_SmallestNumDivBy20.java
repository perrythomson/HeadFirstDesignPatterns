package com.example.projectEuler;

import java.math.BigInteger;

/**
 * Created by perrythomson on 3/23/17.
 */
public class P5_SmallestNumDivBy20 {

    public static void main (String[] args) {
        System.out.println(new P5_SmallestNumDivBy20().run());
    }

    public String run() {
        BigInteger allLCM = BigInteger.ONE;
        for (int i = 1; i <= 20; i ++)
            allLCM = lcm(BigInteger.valueOf(i), allLCM);
            return allLCM.toString();
    }

    private static BigInteger lcm(BigInteger x, BigInteger y) {
        return x.divide(x.gcd(y)).multiply(y);
    }



//    public static boolean checkMath() {
//        int start = 2520;
//        int end = start * (232792560/2520);
//        boolean result = true;
//        for(int i = start + 1; i < end; i++) {
//            result = true;
//            for (int j = 1; j <= 10 ; j++) {
//                if (i % j != 0) {
//                    result = false;
//                    break;
//                }
//            }
//            if (result) {
//                if (i % 250 != 0) {
//                    break;
//                }
//            }
//        }
//        return (result);
//    }











//    static long FindLcm(long a,long b)
//    {
//        long lcm,hcf = 0;
//        long i=1;
//        long ger=a < b ? a : b;
//        while(i<=ger)
//        {
//            if((a%i==0) && (b%i==0))
//                hcf=i;
//            i++;
//        }
//        lcm=(a*b)/hcf;
//        return lcm;
//    }
//    static void FindMultiple()
//    {
//        long lcm=1;
//        for(long i=2;i<=20;i++)
//        {
//            lcm=FindLcm(lcm,i);
//        }
//        System.out.println("Lcm="+lcm);
//    }
}
