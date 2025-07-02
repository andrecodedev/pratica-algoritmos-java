import java.util.Scanner;

public class CalcularVelocidadeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa calcula a velocidade média de um  veículo, dado a distância percorrida e o tempo gasto.");

        System.out.println("Digite a distância percorrida (em km): ");
        double distancia = scanner.nextDouble();
        System.out.println("Digite o tempo gasto (em horas): ");
        double tempo = scanner.nextDouble();

        double velocidadeMedia = distancia / tempo;
        System.out.println("A velocidade média do veículo é: " + velocidadeMedia + "km/h");

        scanner.close();
    }
}
