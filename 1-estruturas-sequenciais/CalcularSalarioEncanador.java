import java.util.Scanner;

public class CalcularSalarioEncanador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa calcula o valor líquido a ser pago a um encanador, dado o numero de dias trabalhados.");

        System.out.println("Digite o número de dias trabalhados pelo encanador: ");
        int diasTrabalhados = scanner.nextInt();

        double salarioBruto = diasTrabalhados * 35;
        double salarioLiquido = salarioBruto - (salarioBruto * 0.08);
        System.out.println("O valor líquido a ser pago é: R$ " + salarioLiquido);

        scanner.close();
    }
}
