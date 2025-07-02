import java.util.Scanner;

public class CalcularConsumoMedioCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa calcula o consumo médio de combustível de um veículo, dado a distância e o combustível gasto.");

        System.out.println("Digite a distância percorrida (em km): ");
        double distancia = scanner.nextDouble();
        System.out.println("Digite a quantidade de combustívelgasto (em litros): ");
        double combustivel = scanner.nextDouble();

        double consumoMedio = distancia / combustivel;
        System.out.println("O consumo médio de combustível é: " + consumoMedio + "km/l");
        
        scanner.close();
    }
}
