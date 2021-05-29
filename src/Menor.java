    /*

Ler 3 numero inteiros e em seguida mostrar o menor e caso
de empate mostrar apenas uma vez.

Entrada             Saida
7 3 8               Menor = 3

5 12 5              Menor = 5

9 9 9               Menor = 9
 */

import java.util.Scanner;

    public class Menor {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if(a < b && a < c){
                System.out.println("Menor " + a);
            }else if (b < c){
                System.out.println("Menor " + b);
            }else{
                System.out.println("Menor " + c);
            }

            scanner.close();
        }

}
