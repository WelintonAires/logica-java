import java.util.Locale;

public class Formatacao {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            double x = 10.35784;

            // imprime o texto SEM uma nova linha (SEM QUEBRA DE TEXTO)
            System.out.print(x);

            // imprime o texto COM uma nova linha (COM QUEBRA DE TEXTO)
            System.out.println(x);

            // formata o resultado eliminando casa decimal
            System.out.printf("%.2f%n", x);
            System.out.printf("%.4f%n", x);
        }
}
