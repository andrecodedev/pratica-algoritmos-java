import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa recebe dois valores e calcula sua média aritmética.");

        System.out.println("Digite o primeiro valor: ");
        double primeiroValor = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double segundoValor = scanner.nextDouble();

        double media = (primeiroValor + segundoValor) / 2;

        System.out.println("A média dos valores é: " + media);

        scanner.close();
    }
}