package Homework1;

public class Triangle {

    public static void main(String[] args) {
        System.out.printf("Площадь %.2f", geroneSquare(2, 2, 2));
    }
    public static double geroneSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}