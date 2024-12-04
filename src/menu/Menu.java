package menu;

import operacoes.Calculadora;
import java.util.Scanner;

public class Menu extends Calculadora {
    Scanner scanner = new Scanner(System.in);
    private double n1;
    private double n2;
    private int opcao = 1;

    public void menuCalculadora() {
        while (opcao != 0) {

            System.out.println("""
                    =======================
                    Escolha uma opção:
                    
                    1 - Somar
                    2 - Subtrair
                    3 - Multiplicar
                    4 - Dividir
                    0 - Fechar
                    =======================
                    """);

            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Encerrando");
                    break;

                case 1:
                    recebeValores();
                    System.out.println("O resultado é " + somaValores(n1, n2));
                    break;

                case 2:
                    recebeValores();
                    System.out.println("O resultado é " + subtraiValores(n1, n2));
                    break;

                case 3:
                    recebeValores();
                    System.out.println("O resultado é " + multiplicaValores(n1, n2));
                    break;

                case 4:
                    recebeValores();
                    System.out.println("O resultado é " + divideValores(n1, n2));
                    break;

                default:
                    System.out.println("Opção Invalida!!!");

            }
        }
    }

    private void recebeValores() {
        System.out.println("Digite o primeiro número:");
        n1 = scanner.nextInt();
        System.out.println("Digite o primeiro número:");
        n2 = scanner.nextInt();
    }

}
