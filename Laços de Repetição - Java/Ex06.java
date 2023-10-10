/* 6. Construa um algoritmo que calcule a média aritmética das 3 notas dos alunos de uma classe. O
algoritmo deverá ler, além das notas, o código (de três dígitos) do aluno e deverá ser encerrado
quando o código for igual a zero.
 */
package ex_04_10;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Informe oódigo do aluno, usando 3 digitos ou digite (0) para sair: \n");
            int codigo = entrada.nextInt();

            if (codigo == 0) {
                System.out.println("Você encerrou o programa!");
                break;
            } else {
                System.out.println("Informe a primeira nota: \n");
                float nota1 = entrada.nextFloat();
                System.out.println("Informe a segunda nota: \n");
                float nota2 = entrada.nextFloat();
                System.out.println("Informe a terceira nota: ");
                float nota3 = entrada.nextFloat();

                float media = (nota1 + nota2 + nota3) / 3;
                System.out.println("Código: " + codigo + " Média: " + media);
            }
        }
                entrada.close();
    }
}
