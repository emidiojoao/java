package atividadesswitchcase;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor inteiro: ");
        int valor = entrada.nextInt();

        int quadrado = valor * valor;
        int cubico = valor * valor * valor;

        System.out.println("O quadrado do valor " + valor + " é: " + quadrado);
        System.out.println("O cubico do valor " + valor + " é: " + cubico);

        entrada.close();
    }

}
