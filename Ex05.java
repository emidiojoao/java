package atividadesswitchcase;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma medida em metros");
        float metros = entrada.nextFloat();

        System.out.println("\nEscolha qual unidade deseja converter: ");
        System.out.println("[1]- Centímetros");
        System.out.println("[2]- Decímetros");
        System.out.println("[3]- Quilômetros");
        System.out.println("[4]- Polegadas");
        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("A conversão do valor " + metros + " para centímetros é: " + (metros * 100) + " cm");
                break;
            case 2:
                System.out.println("A conversão do valor " + metros + " para decímetros é: " + (metros * 10) + " dm");
                break;
            case 3:
                System.out.println("A conversão do valor " + metros + " para quilômetros é: " + (metros / 1000) + " km");
                break;
            case 4:
                System.out.println("A conversão do valor " + metros + " para polegadas é: " + (metros * 39.37));
                break;
            default:
                System.out.println("Opção inválida! D:");
        }
        entrada.close();
    }

}
