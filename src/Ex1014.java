import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //km
        int x = scanner.nextInt();
        //Litros
        double y = scanner.nextDouble();

        double media = x / y;

        System.out.println(String.format("%.3f km/l", media));

        scanner.close();

    }
}
