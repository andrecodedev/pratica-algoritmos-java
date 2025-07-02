import java.util.Scanner;

public class CalcularDobro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que recebe um número e calcula seu dobro.");

        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();

        System.out.println("O dobro do número é: " + (numero * 2));
    
        scanner.close();
    }
}
