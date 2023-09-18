package exerciciosjava;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero = entrada.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor do número " + numero + " é: " + antecessor);
        System.out.println("O sucessor do número " + numero + " é: " + sucessor);

        entrada.close();
    }

}
