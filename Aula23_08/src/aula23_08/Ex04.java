package aula23_08;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o salário que funcionário ganha por mês: ");
        float salarioMensal = entrada.nextFloat();

        System.out.println("Informe a quantia de horas que o funcionário trabalhou no mês: ");
        float horasTrabalhadas = entrada.nextFloat();

        float valorHora = salarioMensal / horasTrabalhadas;

        System.out.println("O valor que o funcionário ganha por hora é: R$ " + valorHora);

        entrada.close();

    }

}
