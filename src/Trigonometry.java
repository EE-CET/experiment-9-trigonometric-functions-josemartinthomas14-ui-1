import java.util.Scanner;

public class Trigonometry {

    public static double sine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public static double cosine(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            double angle = scanner.nextDouble();
            System.out.println("Sine: " + sine(angle));
            System.out.println("Cosine: " + cosine(angle));
        }
        scanner.close();
    }
}
