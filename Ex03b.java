package atividadesswitchcase;

import java.util.Scanner;

public class Ex03b {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número do mês que deseja saber: ");
        int mes = entrada.nextInt();
        switch (mes) {
            case 1:
                System.out.println("O mês informado é Janeiro");
                break;
            case 2:
                System.out.println("O mês informado é Fevereiro");
                break;
            case 3:
                System.out.println("O mês informado é Março");
                break;
            case 4:
                System.out.println("O mês informado é Abril");
                break;
            case 5:
                System.out.println("O mês informado é Maio");
                break;
            case 6:
                System.out.println("O mês informado é Junho");
                break;
            case 7:
                System.out.println("O mês informado é Julho");
                break;
            case 8:
                System.out.println("O mês informado é Agosto");
                break;
            case 9:
                System.out.println("O mês informado é Setembro");
                break;
            case 10:
                System.out.println("O mês informado é Outubro");
                break;
            case 11:
                System.out.println("O mês informado é Novembro");
                break;
            case 12:
                System.out.println("O mês informado é Dezembro");
                break;
            default:
                System.out.println("Informação invalida! :(");
        }
        entrada.close();
    }

}
