//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class task3 {
    static Scanner in;

    static int[][] Input(int n) {
        System.out.println("Розмірність масиву (n <= 20): ");
        System.out.print("n = ");

        for(n = in.nextInt(); n > 20 || n <= 0; n = in.nextInt()) {
            System.out.print("Некоректне n. Введіть ще раз (1 <= n <= 20): ");
        }

        int[][] a = new int[n][n];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                System.out.print("a[" + i + "," + j + "] = ");
                a[i][j] = in.nextInt();
            }
        }

        return a;
    }

    static void Print(int[][] a) {
        int i = 0;

        while(i < a.length) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j] + "\t");
            }

            ++i;
            System.out.println();
        }

    }

    static boolean isSymmetricSequence(int[] row, int[] pattern) {
        if (row.length < pattern.length) {
            return false;
        } else {
            for(int i = 0; i <= row.length - pattern.length; ++i) {
                boolean match = true;

                for(int j = 0; j < pattern.length; ++j) {
                    if (row[i + j] != pattern[j]) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    return true;
                }
            }

            return false;
        }
    }

    static void FindSymmetricRows(int[][] a) {
        int[] pattern1 = new int[]{1, 2, 3, 3, 2, 1};
        int[] pattern2 = new int[]{1, 2, 3, 5, 3, 2, 1};
        boolean found = false;
        System.out.println("Рядки з симетричною послідовністю:");

        for(int i = 0; i < a.length; ++i) {
            if (isSymmetricSequence(a[i], pattern1) || isSymmetricSequence(a[i], pattern2)) {
                System.out.println("Рядок № " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Немає рядків з вказаними послідовностями.");
        }

    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int n = 0;
        int[][] myArray = Input(n);
        System.out.println("Введена матриця:");
        Print(myArray);
        FindSymmetricRows(myArray);
    }
}
