package com.example.headFirstJava.chapter1;

/**
 * Created by perrythomson on 3/9/17.
 */
public class PhraseOMatic {

    public static void main (String[] args) {
        String[] wordList1 = {"Bob", "Sally", "George", "Mark", "Tom", "Lucy", "Lisa", "Carletta", "Bobbie", "Others"};
        String[] wordList2 = {"happy", "sad", "silly", "angry", "horny", "lonely", "bashful", "affectionate", "distant", "absent"};
        String[] wordList3 = {"Nevada", "Florida", "Utah", "Idaho", "Wyoming", "Heaven", "Hell", "New York", "California", "Texas"};

        int oneLength = wordList1.length;
        int twoLength = wordList2.length;
        int threeLength = wordList3.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];
        System.out.println("What we need is a " + phrase);
    }
}

