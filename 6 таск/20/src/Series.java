import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        System.out.print("Введите e: ");
        double e = scanner.nextDouble();

        double sumN = 0;
        double sumE = 0;
        double sumE10 = 0;

        for (int i = 0; i < n; i++) {
            double factorial = 1.0;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }

            double an = Math.pow(x, i) / factorial;

            sumN += an;

            if (Math.abs(an) > e) {
                sumE += an;
            }

            if (Math.abs(an) > e / 10) {
                sumE10 += an;
            }
        }

        double value = Math.exp(x);

        System.out.println("Сумма первых n членов: " + sumN);
        System.out.println("Сумма членов, больших e: " + sumE);
        System.out.println("Сумма членов, больших e/10: " + sumE10);
        System.out.println("Значение функции: " + value);
    }
}