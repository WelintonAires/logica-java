import java.util.Locale;
import java.util.Scanner;

public class CalculaRetangulo {

    public static void main(String[] args) {
        //Entrada de dados para aceitar PONTO.
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base");
        double base = scanner.nextDouble();

        System.out.println("Digite o valor da altura");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * base + 2 * altura;
        double diagonal = Math.sqrt(base * base + altura * altura);

        System.out.printf("AREA = " + "%.4f%n", area);
        System.out.printf("PERIMETRO = " + "%.4f%n", perimetro);
        System.out.printf("DIAGINAL = " + "%.4f%n", diagonal);

        scanner.close();
    }
}
