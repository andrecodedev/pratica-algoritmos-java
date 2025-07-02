import java.util.Scanner;

public class CalcularRaizQuadradaEOitavaPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa recebe um número e calcula sua raiz quadrada e sua oitava potência.");

        System.out.println("Digite o número: ");
        double numero = scanner.nextDouble();

        double raizQuadrada = Math.sqrt(numero);
        double oitavaPotencia= Math.pow(numero, 8);
        System.out.println("A raiz quadrada é: " + raizQuadrada);
        System.out.println("A oitava potência é: " + oitavaPotencia);

        scanner.close();
    }
}
