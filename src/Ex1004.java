import java.util.Scanner;
import java.util.Locale;

public class Ex1004
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        int PROD = valor1 * valor2;

        System.out.println("PROD = " + PROD);

        scanner.close();


    }
}
