//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class task4 {
    public static boolean hasDoubleLetter(String word) {
        for(int i = 0; i < word.length() - 1; ++i) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String text = in.nextLine();
        String[] words = text.split("[ ,.:;\\-?!]+");
        StringBuilder removedWords = new StringBuilder();
        StringBuilder remainingText = new StringBuilder();

        for(String word : words) {
            if (hasDoubleLetter(word)) {
                removedWords.append(word).append(" ");
            } else {
                remainingText.append(word).append(" ");
            }
        }

        System.out.println("Вилучені слова з подвоєнням літер:");
        System.out.println(removedWords.toString().trim());
        System.out.println("Текст після вилучення цих слів:");
        System.out.println(remainingText.toString().trim());
        in.close();
    }
}
