import java.util.Scanner;

public class CalcularSalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa calcula o salário de um empregado, dado o total de horas normais e horas extras trabalhadas.");

        System.out.println("Digite o total de horas normais trabalhadas: ");
        double horasNormais = scanner.nextDouble();
        System.out.println("Digite o total de horas extras trabalhadas: ");
        double horasExtras = scanner.nextDouble();

        double salario = (horasNormais * 10) + (horasExtras * 15);
        System.out.println("O salário do empregado é: R$ " + salario);

        scanner.close();
    }
}
