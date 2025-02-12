import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0, Seletor = 0;
        while (contador != 1) {
            informacoes();
            Seletor = sc.nextInt();
            switch (Seletor) {
                case 1:
                    System.out.println("Escolheu caixa de papelão:");
                    System.out.println("Ideal para trasporte e armazenamento");
                    break;
                case 2:
                    System.out.println("Escolheu sacola plastica");
                    System.out.println("Leve e pratica, mas pouco sustentavel");
                    break;
                case 3:
                    System.out.println("escolheu Emabalgem de vidro");
                    System.out.println("Resistente e reutilizavel ");
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
        System.out.println("===========================");
        System.out.println("1- caixa de papelão");
        System.out.println("2- Sacola plastica");
        System.out.println("3- Embalagem de vidro");
        System.out.println("4- encerrar programa");
        System.out.println("===========================");
    }
}
