package PrimeirasAtividades;

public class Ex06 {

    public static void main(String[] args) {

        float num1 = 8f;
        float num2 = 9f;
        float num3 = 7f;
        float media1 = (num1 + num2 + num3) / 3;

        float num4 = 4f;
        float num5 = 5f;
        float num6 = 6f;
        float media2 = (num4 + num5 + num6) / 3;

        float somaDaMedia = media1 + media2;
        float mediaDaMedia = somaDaMedia / 2;
        System.out.println("A média dos valores 8, 9 e 7 é: " + media1);
        System.out.println("A média dos valores 4, 5 e 6 é: " + media2);
        System.out.println("A soma das duas médias é: " + somaDaMedia);
        System.out.println("A média das duas médias é: " + mediaDaMedia);

    }

}
