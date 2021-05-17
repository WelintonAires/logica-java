import java.util.Scanner;
import java.util.Locale;

public class Ex1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int horas = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();

        int km = horas * velocidadeMedia;

        double litrosGastos = km / 12.0;

        System.out.printf("%.3f%n", litrosGastos);

        scanner.close();
    }
}
