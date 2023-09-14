
package atividadesswitchcase;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número: ");
        float valor1 = entrada.nextFloat();
        System.out.println("Informe mais um número: ");
        float valor2 = entrada.nextFloat();

        System.out.println("\nEscolha uma das seguintes opções: ");
        System.out.println("\n[1]- ADIÇÃO");
        System.out.println("\n[2]- MULTIPLICAÇÃO");
        System.out.println("\n[3]- FINALIZAR");
        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("A soma do número " + valor1 + " com o número " + valor2 + " é: " + (valor1 + valor2));
                break;
            case 2: 
                System.out.println("A multiplicação do número " + valor1 + " com o número " + valor2 + " é: " + (valor1 * valor2));
                break;
            case 3:
                System.out.println("Você finalizou o programa, até a proxima! :D");
                break;
            default:  System.out.println("Opção inválida!");
        }
    }

}
