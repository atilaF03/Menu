import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0, Seletor = 0;
        while (contador != 1) {
            informacoes();
            Seletor = sc.nextInt();
            switch (Seletor) {
                case 1:
                    System.out.println("Escolheu Caneta esferografica:");
                    System.out.println("Econômica e de longa duração");
                    break;
                case 2:
                    System.out.println("Escolheu  Caneta gel");
                    System.out.println("Tinta mais pigmentada e escrita suave");
                    break;
                case 3:
                    System.out.println("Escolheu caneta tinteiro ");
                    System.out.println("Clássica e elegante usada para calegrafia");
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

        System.out.println("1-Caneta Esferográfica");
        System.out.println("2-Caneta Gel");
        System.out.println("3-Caneta Tinteiro:");
    }
}
