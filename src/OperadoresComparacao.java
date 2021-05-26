public class OperadoresComparacao {

    public static void main(String[] args) {

        //MENOR QUE
        boolean menorQue = 5<10;
        System.out.println("MENOR QUE => " + menorQue);

        //MAIOR QUE
        System.out.println(5 > 10);

        //MENOR OU IGUAL A QUE
        System.out.println(10 <= 10);

        //MAIOR OU IGUAL A QUE
        System.out.println(10 >= 10);

        //IGUALDADE
        System.out.println(5 == 10);

        //DIFERENTE
        System.out.println(5 != 10);

        System.out.println("-------------------------------------------------------------------------");


        int x = 5;
        System.out.println(x > 0);    // true
        System.out.println(x == 3);   // false
        System.out.println(10 <= 30); //true
        System.out.println(x != 2);   //true

        System.out.println("---------------------OPERADORES LOGICOS --- AND ou E ----------------------");

        System.out.println(x <= 20 && x == 10); //false

        System.out.println(x > 0 && x != 3);    //true

        System.out.println(x <= 20 && x == 10 && x != 3); //false

        System.out.println("---------------------OPERADORES LOGICOS --- OR ou OU ----------------------");

        System.out.println(x <= 20 || x == 10); //true

        System.out.println(x > 0 || x != 3);    //true

        System.out.println(x <= 20 || x == 10 || x != 3); //true

        System.out.println("---------------------OPERADORES LOGICOS --- NÃO ou NOT ----------------------");

        System.out.println(!(x == 10)); // NÃO É IGUAL A 10 -- TRUE
        System.out.println(!(x >= 2));  // NÃO É MAIOR QUE 2 -- FALSE
        System.out.println((x <= 20) && (x == 10)); // (V) (F) -- FALSE

    }


}
