package aula06_LacosDeRepeticao;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int soma = 0;
        while (true) {
            System.out.println("Informe a idade da " + contador + "º pessoa OU digite [0] para sair.");
            int idade = entrada.nextInt();
            if (idade == 0 || idade < 0) {
                System.out.println("Você encerrou o programa! ");
                contador--;
                break;
            }

            soma = soma + idade;
            contador++;
        }
        System.out.printf("Foram informados %s pessoas. A média de idade é de %s anos.",contador, (soma / contador));
  
    }
}
