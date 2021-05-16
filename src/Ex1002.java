
import java.util.Scanner;
import java.util.Locale;

public class Ex1002 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    //entrada de dados
    double raio;
    double area;
    double n = 3.14159;


    Scanner input = new Scanner(System.in);
    raio = input.nextDouble();

    area = n * (raio * raio);

    //saida de dados
    System.out.printf("A=%.4f", area);


  }
}
