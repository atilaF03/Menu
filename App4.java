import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Seletor, contador = 1;
        double numero1=0, numero2, valor;
        while (contador != 0) {
            informacoes(); 
            Seletor = sc.nextInt();
            switch (Seletor) {
                case 1:

                    System.out.println("insira um valor ");
                    numero1 = sc.nextDouble();
                    System.out.println("insira um segundo valor ");
                    numero2 = sc.nextDouble();
                    valor = numero1 + numero2;
                    System.out.println(valor);
                    break;
                case 2:
                    System.out.println("insira um segundo valor ");
                    numero2 = sc.nextDouble();
                    valor = numero1 - numero2;
                    System.out.println(valor);
                    break;
                case 3:
                    System.out.println("insira um segundo valor ");
                    numero2 = sc.nextDouble();
                    valor = numero1 * numero2;
                    System.out.println(valor);

                case 4:
                    System.out.println("insira um segundo valor ");
                    numero2 = sc.nextDouble();
                    valor = numero1 / numero2;
                    System.out.println(valor);
                    break;
                case 5:

                    System.out.println("programa encerrado com sucesso");
                    contador = 1;
                default:
                    break;
            }
        }
        sc.close();
    }

    public static void informacoes() {
        System.out.println("==============================");
        System.out.println("1 +: ");
        System.out.println("2 -:");
        System.out.println("3 *  ");
        System.out.println("4 / ");
        System.out.println("encerrar programa");
        System.out.println("==============================");
    }
}
