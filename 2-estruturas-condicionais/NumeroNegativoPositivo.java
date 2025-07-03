import java.util.Scanner;

public class NumeroNegativoPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa recebe um número e informa se é positivo ou negativo.");

        System.out.println("Digite o numero: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("O número digitado é positivo.");
        }else{
            System.out.println("O número digitado é negativo.");
        }

        scanner.close();
    }
}