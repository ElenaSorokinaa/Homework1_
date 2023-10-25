import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.println("Сторона a: ");
                int a = scanner.nextInt();

                System.out.println("Сторона b: ");
                int b = scanner.nextInt();

                int area = (a*b )/2;
                System.out.println(" Плошадь треугольника равна " + area);

    }
}
