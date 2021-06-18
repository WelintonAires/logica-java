package estruturarepeticao.facaenquanto;
import java.util.Locale;
import java.util.Scanner;

public class FacaEnquanto {
    /*
    Problema exemplo:
    Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
    Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
    programa.

    Formula
            F = (9c/5 )+32


     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        char resposta;
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double c = scanner.nextDouble();
            double formula = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", formula);
            System.out.println("Deseja repetir novamente a conversao (S/N)");
            resposta = scanner.next().charAt(0);
        }while (resposta != 'n');

        scanner.close();
    }
}

