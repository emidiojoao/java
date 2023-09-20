
package atividades;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Informe a quantidade mínima de peças: ");
        int estoqueInicial = entrada.nextInt();
        
        System.out.println("Informe a quantidade máxima da peças: ");
        int estoqueFinal = entrada.nextInt();
        
        int estoqueMedio = (estoqueInicial + estoqueFinal) / 2;
        System.out.println("A média de peças no estoque é: " + estoqueFinal);
        
        entrada.close();
    }
    
}
