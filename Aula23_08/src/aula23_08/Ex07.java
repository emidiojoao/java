package PrimeirasAtividades;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o salário do funcionário: ");
        float salario = entrada.nextFloat();

        float valorReajuste = (salario * 18) / 100;
        float novoSalario = valorReajuste + salario;
        System.out.println("O salário do funcionário era: R$ " + salario);
        System.out.println("Com o reajuste de 18% que equivale R$ " + valorReajuste + " o novo salário será: R$ " + novoSalario);

        entrada.close();
    }
}
