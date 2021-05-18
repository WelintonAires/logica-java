import java.util.Scanner;
import java.util.Locale;

public class Ex1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double media = ((a * 3.5) + (b * 7.5)) / 11.0;

        System.out.printf("MEDIA = %.5f%n", media);

        scanner.close();
    }

}
