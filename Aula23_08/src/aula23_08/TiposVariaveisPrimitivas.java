package aula23_08;

public class TiposVariaveisPrimitivas {

    public static void main(String[] args) {

        char sexo = 'F';
        System.out.println("sexo: " + sexo);

        byte cod = 120;
        System.out.println("Código: " + cod);

        short qtdPecas = 32154;
        System.out.println("quantidade de peças: " + qtdPecas);

        int valorA = 5;
        int valorB = 4;
        int total = valorA + valorB;

        System.out.println("A soma de A + B é: " + total);

        float valor_Total = 15.75f;
        System.out.println("valor total: R$" + valor_Total);

        double kmRodado = 75.987;
        System.out.println("Quilometragem rodada: " + kmRodado + " Km");

        long n = 123456789963258741L;
        System.out.println("n: " + n);
        
        boolean aberto = true;
        System.out.println("A loja está aberta: " + aberto);
        
        long n1 = 12365478932145L;
        byte x = (byte)n1;
        System.out.println("x " + x);
        
    } 
    

}
