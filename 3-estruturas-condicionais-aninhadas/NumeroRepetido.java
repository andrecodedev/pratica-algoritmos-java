import java.util.Scanner;

public class NumeroRepetido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa que recebe três números e verifica se existe algum repetido entre eles.");

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 || num1 == num3) {
            System.out.println("O número " + num1 + " é repetido.");
        } else if (num2 == num3) {
            System.out.println("O número " + num2 + " é repetido.");
        } else {
            System.out.println("Não existe número repetido.");
        }

        scanner.close();
    }
}
