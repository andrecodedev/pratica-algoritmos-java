import java.util.Scanner;

public class IntervaloDeValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa que recebe um intervalo de dois valores e indica de o número seguinte esta dentro, fora ou nas extremidades do intervalo.");

        System.out.println("Digite o primeiro número do intervalo: ");
        double PrimeiroIntervalo = scanner.nextDouble();
        System.out.println("Digite o segundo número do intervalo: ");
        double SegundoIntervalo = scanner.nextDouble();

        System.out.println("Digite o número de comparação: ");
        double numero = scanner.nextDouble();

        if (numero > PrimeiroIntervalo && numero < SegundoIntervalo) {
            System.out.println("O número " + numero + " está dentro do intervalo.");
        } else if (numero >= PrimeiroIntervalo && numero <= SegundoIntervalo) {
            System.out.println("O número " + numero + " está em uma extremidade do intervalo.");
        } else {
            System.out.println("O número " + numero + " está foda do intervalo.");
        }

        scanner.close();
    }
}
