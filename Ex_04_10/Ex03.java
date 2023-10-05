package aula04_10;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o preço do produto: ");
        float produto = entrada.nextFloat();
        System.out.println("Informe o número da sua região: \n");
        System.out.println("[1]- Região norte com desconto de 5%");
        System.out.println("[2]- Região sul com desconto de 15%");
        System.out.println("[3]- Região sudeste com desconto de 7%");
        System.out.println("[4]- Região nordeste com desconto de 12%");
        System.out.println("[5]- Região centro-oeste com desconto de 20%");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                float descontoNorte = 0;
                descontoNorte = produto * (5f / 100f);
                System.out.println("O desconto do produto foi de R$ " + descontoNorte + " Você deverá pagar R$ " + (produto - descontoNorte));
                break;
            case 2:
                float descontoSul = produto * (15f / 100f);
                System.out.println("O desconto do produto foi de R$ " + descontoSul + " Você deverá pagar R$ " + (produto - descontoSul));
                break;
            case 3:
                float descontoSudeste = produto * (7f / 100f);
                System.out.println("O desconto do produto foi de R$ " + descontoSudeste + " Você deverá pagar R$ " + (produto - descontoSudeste));
                break;
            case 4:
                float descontoNordeste = produto * (12f / 100f);
                System.out.println("O desconto do produto foi de R$ " + descontoNordeste + " Você deverá pagar R$ " + (produto - descontoNordeste));
                break;
            case 5:
                float descontoCentroOeste = produto * (20f / 100f);
                System.out.println("O desconto do produto foi de R$ " + descontoCentroOeste + " Você deverá pagar R$ " + (produto - descontoCentroOeste));
                break;
            default:
                System.out.println("Error! Produto importado.");
        }
    }
}
