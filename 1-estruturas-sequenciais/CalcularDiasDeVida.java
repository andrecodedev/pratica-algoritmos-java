import java.util.Scanner;

public class CalcularDiasDeVida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa calcula o número aproximado de dias de vida de uma pessoa, dado seu nao de nascimento.");

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = 2025;
        int idadeEmAnos = anoAtual - anoNascimento;
        int diasDeVida = idadeEmAnos * 365;

        System.out.println("A pessoa tem aproximadamente " + diasDeVida + " dias de vida.");

        scanner.close();
    }
}
