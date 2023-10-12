package aula06_LacosDeRepeticao;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int contador = 0;
        
        System.out.println("Informe um número positivo: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("Opção inválida! O número informado é negativo.");
        }
        else {
            while (contador < numero) {

                if (contador % 2 == 0) {
                    System.out.println("Os números pares entre o número e zero: " + contador);
                }
                
                contador++;
            }
        }
    }
}
    