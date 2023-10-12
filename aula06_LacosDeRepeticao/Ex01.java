package aula06_LacosDeRepeticao;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        System.out.println("Você deseja tomar um chopp?");
        char opcao = entrada.next().charAt(0);

        opcao = Character.toUpperCase(opcao);

        if (opcao == 'S') {
            while (true) {
                soma = soma + 1;
                System.out.println("Deseja beber mais um chopp? ");
                opcao = entrada.next().charAt(0);
                opcao = Character.toUpperCase(opcao);
                if (opcao == 'N') {
                    System.out.println("Você bebeu " + soma + " chopp.");
                    break;
                }
            }
        } else {
            System.out.println("Boa noite! Você não bebeu nada.");
        }
    }

}
