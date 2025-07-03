import java.util.Scanner;

public class VerificacaoFaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que recebe um número de verifica se uma faixa está de 0 à 9.");

        System.out.println("Digite o número: ");
        double numero = scanner.nextDouble();

        if (numero >= 0 && numero <= 9) {
            System.out.println("O número " + numero + " está na faixa de 0 a 9.");
        } else {
            System.out.println("O número " + numero + " não está na faixa de 0 a 9.");
        }

        scanner.close();
    }
}