package com.hillel.suraieva;


public class Main {
    public static void main(String[] args) {
        String stroka = "паралелепипед";
        char symbol = 'п';
        System.out.println(findSymbolOccurance(stroka, symbol));

        String source = "абракадабра";
        String target = "кадабра";
        System.out.println(findWordPosition(source, target));

        String stroka1 = "privet";
        System.out.println(stringReverse(stroka1));

        System.out.println(isPalindrom("мамам"));

    }

    public static int findSymbolOccurance(String stroka, char symbol) {
        int kol = 0;
        char[] strokaInSymbols = stroka.toCharArray();
        for (int i = 0; i < strokaInSymbols.length; i++) {
            if (symbol == strokaInSymbols[i])
                kol++;
        }
        return kol;
    }


    public static int findWordPosition(String source, String target) {
        if (source.contains(target)) {
            return source.indexOf(target);
        }
        return -1;
    }

    public static StringBuilder stringReverse(String stroka) {
        StringBuilder reversedStroka = new StringBuilder(stroka).reverse();
        return reversedStroka;
    }

    public static boolean isPalindrom(String stroka) {
        StringBuilder reversedStroka0 = new StringBuilder(stroka).reverse();
        String reversedStroka = String.valueOf(reversedStroka0);
        return stroka.equals(reversedStroka);
    }
}
