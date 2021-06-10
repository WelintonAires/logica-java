package estruturarepeticao.enquanto;

public class Escrita1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        while (x > 2) {
            System.out.println(x);
            y = y + x;
            x = x - 1;
        }
    }

}
