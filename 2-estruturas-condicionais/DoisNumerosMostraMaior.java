import java.util.Scanner;

public class DoisNumerosMostraMaior {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Programa que recebe dois números e mostra o maior deles.");

    System.out.println("Digite o primeiro número: ");
    double numero1 = scanner.nextDouble();
    System.out.println("Digite o segundo número: ");
    double numero2 = scanner.nextDouble();

    if(numero1 > numero2){
        System.out.println("O maior número é: " + numero1);
    }else {
        System.out.println("O maior número é: " + numero2);
    }

    scanner.close();
    }
}
