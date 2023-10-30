package Homework1;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double square = 3.14 * radius * radius;

        System.out.println((int) (square));
    }
}
