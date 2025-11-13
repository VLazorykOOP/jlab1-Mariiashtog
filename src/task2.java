//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;
import java.util.Scanner;

class task2 {
    static Scanner in;

    static int[] Input() {
        System.out.println("Розмірність масиву (n ≤ 400): ");
        int n = in.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; ++i) {
            System.out.print("a[" + i + "] = ");
            a[i] = in.nextInt();
        }

        return a;
    }

    static void Print(int[] a) {
        for(int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    static Integer FindMaxUnique(int[] a) {
        Arrays.sort(a);
        Integer maxUnique = null;

        for(int i = a.length - 1; i >= 0; --i) {
            boolean isUnique = true;
            if (i > 0 && a[i] == a[i - 1]) {
                isUnique = false;
            }

            if (i < a.length - 1 && a[i] == a[i + 1]) {
                isUnique = false;
            }

            if (isUnique) {
                maxUnique = a[i];
                break;
            }
        }

        return maxUnique;
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int[] myArray = Input();
        System.out.println("Вихідний масив:");
        Print(myArray);
        Integer result = FindMaxUnique(myArray);
        if (result != null) {
            System.out.println("Максимальне число, яке не повторюється: " + result);
        } else {
            System.out.println("Максимального числа немає!");
        }

    }
}
