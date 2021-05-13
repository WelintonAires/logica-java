import java.util.Locale;
import java.util.Scanner;

public class CalculaTerreno {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // entrada de dados
        double largura = scanner.nextDouble();
        double comprimento = scanner.nextDouble();

        double metroQuadrado = scanner.nextDouble();
        // processamento
        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        // saida de dados
        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);


        scanner.close();
    }
}

