import java.util.Scanner;

public class DivisaoPossivelOuNaoPossivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que recebe o numerador e denominador para realizar uma divisão.");

        System.out.println("Digite o numerador: ");
        double numerador = scanner.nextDouble();

        System.out.println("Digite o denominador: ");
        double denominador = scanner.nextDouble();

        if (denominador != 0) {
            double soma = numerador / denominador;
            System.out.println("O resultado da divisão é: " + soma);
        }else{
            System.out.println("Não existe divisão por zero.");
        }

        scanner.close();
    }
}
