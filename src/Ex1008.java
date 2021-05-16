import java.util.Scanner;
import java.util.Locale;

public class Ex1008 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    Locale.setDefault(Locale.US);

    int NUMBER = scanner.nextInt();
    int quantidadeDeHorasTrabalhadas = scanner.nextInt();
    double valorDeHora = scanner.nextDouble();

    double SALARY = (valorDeHora * quantidadeDeHorasTrabalhadas);

    System.out.println("NUMBER = " + NUMBER);
    System.out.printf("SALARY = U$ " + "%.2f%n", SALARY);

    scanner.close();
    }


}
