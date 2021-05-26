import java.util.Locale;
import java.util.Scanner;

public class MelhoriaCalculaBhaskara {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = b * b - 4.0 * a * c;

        if (a == 0 || delta < 0.0) {
            System.out.println("Impossivel de calcular");
        } else {


            double xLinha = (-b + Math.sqrt(delta)) / 2.0 * a;
            double xDuasLinha = (-b - Math.sqrt(delta)) / 2.0 * a;

            System.out.printf("X linha = %.5f%n", xLinha);
            System.out.printf("X duas linha = %.5f%n", xDuasLinha);
        }

            scanner.close();


    }
}


