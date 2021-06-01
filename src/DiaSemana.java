public class DiaSemana {
    public static void main(String[] args) {
        int diaSemana = 7;

        if (diaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda-feira");
        } else if (diaSemana == 3) {
            System.out.println("Terça-feira");
        } else {
            System.out.println("Dia nao encontrado");
        }

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;

            default:
                System.out.println("Dia nao encontrado");
        }
    }
}
