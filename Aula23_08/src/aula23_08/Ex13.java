
package atividades;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe o nome do vendedor: ");
        String vendedor = entrada.next();
        System.out.println("Informe o código da peça: ");
        int codigoPeca = entrada.nextInt();
        System.out.println("Informe o preço unitário da peça: ");
        float valorUnitario = entrada.nextFloat();
        System.out.println("Informe quantas peças foram vendidas; ");
        int quantiaVendida = entrada.nextInt();
        
        float valorTotal = quantiaVendida * valorUnitario;
        float comissaoVendedor = (valorTotal * 5) / 100;
        
        System.out.println("Identificação: " + vendedor);
        System.out.println("O código da peça: " + codigoPeca);
        System.out.println("O preço unitário da peça: " + valorUnitario);
        System.out.println("Foram vendidos: " + quantiaVendida + " peças.");
        System.out.println("O lucro da venda foi de R$ " + valorTotal);
        System.out.println("A comissão do vendedor " + vendedor + " será de R$ " + comissaoVendedor);
        
        entrada.close();
    }
}
