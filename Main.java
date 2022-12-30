import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        double perimeter = side1 + side2 + side3;
        double p = perimeter / 2;
        double differenceProduct = (p - side1) * (p - side2) * (p - side3);
        double area = Math.sqrt(p * differenceProduct);
        System.out.println(area);
    }
}