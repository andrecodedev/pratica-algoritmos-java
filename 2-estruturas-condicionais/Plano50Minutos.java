import java.util.Scanner;

public class Plano50Minutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que calcula o valor a ser pago por um plano de 50 minutos.");

        int valorPlano = 50;
        int minutosPlano = 50;

        System.out.println("Informe o número de minutos utilizados: ");
        int minutosUtilizados = scanner.nextInt();
        
        if (minutosUtilizados <= minutosPlano) {
            System.out.println("O valor a ser pago é: " + valorPlano);
        }else {
            int minutosExcedentes = minutosUtilizados - minutosPlano;
            double valorExcedente = minutosExcedentes * 1.50;
            double valorTotal = valorPlano + valorExcedente;
            System.out.println("O valor a ser pago é: " + valorTotal);
        }
        
        scanner.close();
    }
}