package estruturarepeticao.para;

import java.util.Scanner;

public class ExUri1071 {
    public static void main(String[] args) {
          /*
https://www.urionlinejudge.com.br/judge/pt/problems/view/1071
        Soma de Impares Consecutivos I

        Leia 2 valores inteiros X e Y.
        A seguir, calcule e mostre a soma dos números impares entre eles.

        Entrada
        O arquivo de entrada contém dois valores inteiros.

        Saída
        O programa deve imprimir um valor inteiro.
        Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na
        entrada que deverá caber em um inteiro.

        Exemplo de Entrada              	Exemplo de Saída
        6                                   5
        -5
                    6 5 4 3 2 1 0 -1 -2 -3 -4 -5
        15                                  13
        12

        12                                  0
        12

     */

            Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); // 6
        int y = scanner.nextInt(); // -5

        int menor, maior;

        // crescente
        if (x < y) {
            menor = x;
            maior = y;

            // decrescente
        } else {
            menor = y; // -5
            maior = x; // 6
        }
        //  -5 -4 -3 -2 -1 0 1 2 3 4 5 6
        int soma=0;
        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);


        scanner.close();
    }
}