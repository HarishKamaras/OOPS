package com.brigdelabz.objectorientedprograms;

import java.util.Arrays;

public class DeckOfCards {
    void sort(String[] shafulledx) {
        String[] sortshafulled = new String[shafulledx.length];
        for (int i = 0; i < shafulledx.length; i++) {
            //System.out.println("sort Player : " + i);
            String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
            for (int k = 0; k < shafulledx.length; k++) {
                if (shafulledx[k].contains(ranks[i])) {
                    sortshafulled[k] = shafulledx[k];
                    System.out.println("sort :" + sortshafulled[k]);
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to DeckOfCards");
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        // Shafulle the cards
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            System.out.println("index"+index);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        String[] shafulled = new String[52];
        // Display the all the cards

        for (int i = 0; i < 52; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println(rank + " of " + suit);
            shafulled[i] = rank + " " + suit;
        }
        // distributing to 4
        int j = 0, set = 13;
        //check i=0
        for (int i = 0; i < 4; i++) {
            for (j = 1; j < set; j++) {
                System.out.println("shafulled player" + i + "= " + shafulled[j]);
                System.out.println("No : " + j);
            }
            set = set + 13;
        }
        String[] shafulled1 = Arrays.copyOfRange(shafulled, 0, 13);
        System.out.println("******************************Player1Notsorted*****************");
        System.out.println("lenght" + shafulled1.length);
        for (int i = 0; i < shafulled1.length; i++) {
            System.out.println("no" + i);
            System.out.println("shafulled one" + shafulled1[i]);
        }
        String[] shafulled2 = Arrays.copyOfRange(shafulled, 13, 26);
        System.out.println("******************************Player2Notsorted*****************");
        System.out.println("lenght" + shafulled2.length);
        for (int i = 0; i < shafulled2.length; i++) {
            System.out.println("no" + i);
            System.out.println("shafulled two" + shafulled2[i]);
        }
        String[] shafulled3 = Arrays.copyOfRange(shafulled, 26, 39);
        System.out.println("******************************Player3Notsorted*****************");
        System.out.println("lenght" + shafulled3.length);
        for (int i = 0; i < shafulled2.length; i++) {
            System.out.println("no" + i);
            System.out.println("shafulled three" + shafulled3[i]);
        }
        String[] shafulled4 = Arrays.copyOfRange(shafulled, 39, 52);
        System.out.println("******************************Player4Notsorted*****************");
        System.out.println("lenght" + shafulled4.length);
        for (int i = 0; i < shafulled4.length; i++) {
            System.out.println("no" + i);
            System.out.println("shafulled four" + shafulled4[i]);
        }
        // Sorted Order
        DeckOfCards sorting = new DeckOfCards();
        System.out.println("***************************Player1*************************");
        sorting.sort(shafulled1);
        System.out.println("***************************Player2*************************");
        sorting.sort(shafulled2);
        System.out.println("***************************Player3*************************");
        sorting.sort(shafulled3);
        System.out.println("***************************Player4*************************");
        sorting.sort(shafulled4);
    }
}
