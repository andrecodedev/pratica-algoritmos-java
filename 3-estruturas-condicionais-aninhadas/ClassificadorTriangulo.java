import java.util.Scanner;

public class ClassificadorTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Programa que os lados de um triângulo e classifica-o.");

        System.out.print("Digite o primeiro lado do triângulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Digite o segundo lado do triângulo: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Digite o terceiro lado do triângulo: ");
        double lado3 = scanner.nextDouble();

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("O triângulo é equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triângulo é isósceles.");
        } else {
            System.out.println("O triângulo é escaleno.");
        }

        scanner.close();
    }
}