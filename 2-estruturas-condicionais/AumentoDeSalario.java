import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que calcula o aumento de salário.");

        System.out.println("Informe o salário atual: ");
        double salarioAtual = scanner.nextDouble();

        double novoSalario = 0;

        if (salarioAtual <= 1000){
            novoSalario = salarioAtual * 0.05;
        }else {
            novoSalario = salarioAtual * 0.07;
        }

        System.out.println("O novo salário é: " + (salarioAtual + novoSalario));



        scanner.close();
    }
}
