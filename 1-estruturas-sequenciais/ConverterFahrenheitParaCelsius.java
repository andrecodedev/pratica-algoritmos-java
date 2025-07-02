import java.util.Scanner;

public class ConverterFahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa recebe uma temperatura em Fahrenheit e converte para Celsius.");

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println("A temperatura em Celsius é: " + celsius);

        scanner.close();
    }
}
