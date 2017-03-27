package com.example;

import com.example.projectEuler.projectEuler_Q0001_Multiples_Of_3_And_5.Multiples_3_and_5;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;

import com.example.projectEuler.projectEuler_Q0001_Multiples_Of_3_And_5.*;

/**
 * Created by perrythomson on 3/27/17.
 */
public class test_Mof_3_5 {

    @Test
    public void testCalculateSumOfMultiples() {
        long result = Multiples_3_and_5.calculateSumOfMultiples(3, 5, 10);
        assertTrue("Result of calculateSumOfMultiples(3, 5, 10) is 23", result ==23);
        result = Multiples_3_and_5.calculateSumOfMultiples(3, 5, 30);
        //if calculateSumOf Multiples(3, 5, 20) returns 210, you did not eleimate common multiples
        assertTrue("Result of calculateSumOfMultiples(3, 5, 30) is 195", result == 195);
    }

    @Test
    public void testAggregateMultiples(){
        Set<Integer> multiples = Multiples_3_and_5.aggregateMultiples(3,10);
        assertTrue("Size of returned set is 3", multiples.size() == 3);
        int answer = sumMultiples(multiples);
        assertTrue("Sum of returned set is 18", answer == 18);
        multiples = Multiples_3_and_5.aggregateMultiples(5, 25);
        assertTrue("Size of returned set is 4", multiples.size() == 4);
        answer = sumMultiples(multiples);
        assertTrue("Sum of returned set is 50", answer == 50);
    }

    private int sumMultiples (Set<Integer> multiples) {
        int answer = 0;
        for (Iterator<Integer> iterator = multiples.iterator(); iterator.hasNext();) {
            Integer value = (Integer) iterator.next();
            answer += value;
        }
        return answer;
    }
}