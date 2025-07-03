import java.util.Scanner;

public class DoisNummerosOrdemCrecendoIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que recebe dois números e mostra eles em ordem crescente, usando somente IF sem ELSE.");

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero1 < numero2) {
            System.out.println("Os números em ordem crescente são: " + numero1 + " e " + numero2);
        }
        if (numero1 > numero2) {    
            System.out.println("Os números em ordem crescente são: " + numero2 + " e " + numero1);
        }

        scanner.close();
    }
}
