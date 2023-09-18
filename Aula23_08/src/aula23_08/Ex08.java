package PrimeirasAtividades;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do produto: ");
        float produto = entrada.nextFloat();
        System.out.println("Informe o valor do desconto em porcentagem: ");
        float desconto = entrada.nextFloat();

        float descontoDinheiro = (produto * desconto) / 100;
        float produtoComDesconto = produto - descontoDinheiro;
        System.out.println("O produto custava: R$ " + produto);
        System.out.println("O desconto de " + desconto + " % equivale a: R$ " + descontoDinheiro);
        System.out.println("O produto com desconto ficou: R$ " + produtoComDesconto);

        entrada.close();
    }

}
