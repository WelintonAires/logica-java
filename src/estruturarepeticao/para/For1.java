package estruturarepeticao.para;

public class For1 {
    public static void main(String[] args) {
        int x = 4;
        int y = x + 2;
        int i = 0;
        for (i = 0; i < x; i++){
            System.out.println(x + " "+ y);
            y = y + i;
        }

    }
}
