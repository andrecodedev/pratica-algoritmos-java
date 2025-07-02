import java.util.Scanner;

public class ConverterMetrosParaCentimetros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa recebe um comprimento em metros e o converte para centímetros.");

        System.out.println("Digite o comprimento em metros: ");
        double metros = scanner.nextDouble();

        System.out.println("O comprimento em centímetros é: " + (metros * 100));

        scanner.close();
    }
}
