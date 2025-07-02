import java.util.Scanner;

public class CalcularPerimetroCircunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa recebe o raio de uma circunferência e calcula seu perímetro.");

        System.out.println("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();

        double perimetro = 2 * 3.14 * raio;
        System.out.println("O perímetro da circunferência é: " + perimetro);

        scanner.close();
    }
}
