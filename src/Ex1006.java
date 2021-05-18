import java.util.Scanner;
import java.util.Locale;

public class Ex1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double media = (a * 2 + b * 3 + c * 5) / 10.0;

        System.out.printf("MEDIA = %.1f%n", media);

        scanner.close();
    }
}
