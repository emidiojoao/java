package exerciciosjava;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {  
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a cotação em dólar: ");
        float dolar = entrada.nextFloat();
        
        System.out.println("Informe uma quantia em dólar: ");
        float quantiaDolar = entrada.nextFloat();
        
        float real = dolar * 4.86f;
        float quantiaReal = real * quantiaDolar;
        
        System.out.println("O valor do dólar informado foi: US$ " + dolar + " convertido para real ficou: R$ " + real);
        System.out.println("A quantia em dólar informado foi: US$ " + quantiaDolar + " convertido para real ficou: R$ " + quantiaReal);
        
        entrada.close();
    }
    
}
