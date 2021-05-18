import java.util.Scanner;
import java.util.Locale;

public class Ex1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();
        int minutos = (60 * distancia) / 30;

        System.out.println(minutos + " minutos");
        scanner.close();
    }
}
