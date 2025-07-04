package Lista3ComandosDeDecisãoIfAninhados;

import java.util.Scanner;

class PositivoNegativoNulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que verifica se um número é positivo, negativo ou nulo.");

        System.out.println("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("O numero: " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O numero: " + numero + " é negativo.");
        } else {
            System.out.println("O numero: " + numero + " é nulo.");
        }

        scanner.close();
    }
}