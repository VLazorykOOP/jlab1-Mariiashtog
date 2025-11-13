//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

class ExpressionCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Варіант 1 ");
        System.out.print("Введіть n (double): ");
        double n1 = in.nextDouble();
        System.out.print("Введіть m (double): ");
        double m1 = in.nextDouble();
        if (m1 == n1) {
            System.out.println("Помилка: ділення на нуль у виразі (m - n).");
        } else {
            double result1 = (n1 + (double)1.0F) / (n1 * n1 * m1 + (double)2.0F) + (m1 + n1) / (m1 - n1) + Math.pow(n1, (double)3.0F);
            System.out.println("Результат (double) = " + result1);
        }

        System.out.println(" Варіант 2 ");
        System.out.print("Введіть n (int): ");
        int n2 = in.nextInt();
        System.out.print("Введіть m (int): ");
        int m2 = in.nextInt();
        if (m2 == n2) {
            System.out.println("Помилка: ділення на нуль у виразі (m - n).");
        } else {
            double result2 = (double)(n2 + 1) / (double)(n2 * n2 * m2 + 2) + (double)(m2 + n2) / (double)(m2 - n2) + Math.pow((double)n2, (double)3.0F);
            System.out.println("Результат (double) = " + result2);
        }

        System.out.println(" Варіант 3 ");
        System.out.print("Введіть n (double): ");
        double n3 = in.nextDouble();
        System.out.print("Введіть m (double): ");
        double m3 = in.nextDouble();
        if (m3 == n3) {
            System.out.println("Помилка: ділення на нуль у виразі (m - n).");
        } else {
            double temp = (n3 + (double)1.0F) / (n3 * n3 * m3 + (double)2.0F) + (m3 + n3) / (m3 - n3) + Math.pow(n3, (double)3.0F);
            int result3 = (int)temp;
            System.out.println("Результат (int) = " + result3);
        }

        in.close();
    }
}
