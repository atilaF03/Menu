import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Seletor = 0, contador = 0;
        while (contador != 1) {
            informacoes();
            Seletor = sc.nextInt();
            switch (Seletor) {
                case 1:
                    System.out.println("Escolheu mochila Escolar:");
                    System.out.println("Compacta e ideal para estudante");
                    System.out.println("peso maximo 3 kg");
                    break;
                case 2:
                    System.out.println("Escolheu mochila  de viagem");
                    System.out.println(" Espaçosa, ideal para longas jornadas");
                    System.out.println("peso maximo 50kg");
                    break;
                case 3:
                    System.out.println("Escolhu mochila esportiva ");
                    System.out.println("Leve, resistente e ergonômica");
                    System.out.println("peso maximo 8 kg");
                case 4:
                    System.out.println("programa encerrado com sucesso");
                    contador = 1;
                default:
                    break;
            }

        }

        sc.close();
    }

    public static void informacoes() {
        System.out.println("============================================");
        System.out.println("1-Mochila Escolar: ");
        System.out.println("2-Mochila de Viagem:");
        System.out.println("3-Mochila Esportiva: ");
        System.out.println("4-Encerrar porgrama ");
        System.out.println("============================================");
    }
}
