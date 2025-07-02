import java.util.Scanner;

public class CalcularDivisaoEResto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa recebe dois números inteiros e retorna o valor da divisão e o resto da divisão.");

        System.out.println("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();

        System.out.println("Resultado da divisão: " + (primeiroNumero / segundoNumero));
        System.out.println("Resto da divisão: " + (primeiroNumero % segundoNumero));

        scanner.close();
    }
}
