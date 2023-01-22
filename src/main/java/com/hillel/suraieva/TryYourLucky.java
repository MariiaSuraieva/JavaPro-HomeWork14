package com.hillel.suraieva;

import java.util.Arrays;
import java.util.Scanner;

public class TryYourLucky {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple",
                "pumpkin", "potato"};
        System.out.println("I made a word ;)" + "\n" +
                "Try to guess. The word could be one of them:" + "\n"+
                "apple, orange, lemon, banana, apricot, avocado,\n" +
                "broccoli, carrot, cherry, garlic, grape, melon, leak, kiwi,\n" +
                "mango, mushroom, nut, olive, pea, peanut, pear, pepper, pineapple,\n" +
                "pumpkin, potato");
        int i = (int) (Math.random() * words.length);
        String madedWord = words[i];
        String usersWord;
        char[] symbols = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};


        do {
            for (int j = 0; j < symbols.length; j++) {
                System.out.print(symbols[j]);
            }
            System.out.println("\n" + "your turn");
            Scanner scanner = new Scanner(System.in);
            usersWord = scanner.next();
            if (usersWord.equals(madedWord)) {
                System.out.println("Congratulations, you are right, it's " + madedWord);
                break;
            } else {
                char[] symbolsMadedWord = madedWord.toCharArray();
                char[] symbolsUsersWord = usersWord.toCharArray();
                int lengthMassiv;
                if (symbolsUsersWord.length <= symbolsMadedWord.length) {
                    lengthMassiv = symbolsUsersWord.length;
                } else lengthMassiv = symbolsMadedWord.length;
                for (int j = 0; j < lengthMassiv; j++) {
                    if (symbolsUsersWord[j] == symbolsMadedWord[j])
                        symbols[j] = symbolsUsersWord[j];
                }
                scanner.nextLine();
            }
        } while (!usersWord.equals(madedWord));


    }
}
