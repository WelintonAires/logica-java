import java.util.Locale;
import java.util.Scanner;

public class ExercicioPrograma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();
        int soma = 0;
        int count = 0;

        while (idade >= 0) {
            soma += idade;
            count++;
            idade = scanner.nextInt();
        }

        if (count > 0) {
            double media = (double) soma / count;
            System.out.printf("%.2f%n", media);
        } else {
            System.out.printf(" impossivel de calcular");
        }
    }
}


