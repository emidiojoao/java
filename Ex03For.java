
package atividades;
/*3. Faça um programa que leia uma sequência de números inteiros e imprima o maior
número digitado. O programa deve parar de ler números quando o usuário digitar o
número -1. Utilize a estrutura de repetição for
*/
import java.util.Scanner;

public class Ex03For {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        
        for (int contador = 0; contador < 10 ; contador++) {
            System.out.println("Digite um número ou digite (-1) para parar: ");
            int numero = entrada.nextInt();
            
            if (numero == -1) {
                System.out.println("O maior número informado foi: " + contador);
            }
        }
    }
}
